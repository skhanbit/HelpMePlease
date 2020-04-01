package com.hm.config.db;


import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages="com.hm")
@PropertySource("classpath:database.properties")
public class DbConfiguration
{
	@Autowired
	Environment environment;
	
	@Bean
	DataSource hmDataSource() 
	{
//		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setUrl     (environment.getProperty("url"));
		dataSource.setUsername(environment.getProperty("dbuser"));
		dataSource.setPassword(environment.getProperty("dbpassword"));
		dataSource.setDriverClassName(environment.getProperty("driver"));
		dataSource.setMaxIdle(Integer.valueOf(environment.getRequiredProperty("maxIdle")));
		dataSource.setMinIdle(Integer.valueOf(environment.getRequiredProperty("minIdle")));
		dataSource.setMaxWaitMillis(Integer.valueOf(environment.getRequiredProperty("maxWaitMillis")));
		dataSource.setValidationQuery(environment.getRequiredProperty("validationQuery"));
		
		return dataSource;
	}
	
    @Bean(name = "hm")
    public JdbcTemplate hmJdbcTemplate(@Qualifier("hmDataSource")DataSource dataSource) 
    {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        jdbcTemplate.setResultsMapCaseInsensitive(true);
        return jdbcTemplate;
    }
    
    @Bean(name="namedHm")
    public NamedParameterJdbcTemplate hmNamedParamTemplate(@Qualifier("hmDataSource")DataSource dataSource) 
    {
    	NamedParameterJdbcTemplate jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
        return jdbcTemplate;
    }
    
    @Bean(name="transactionManager")
    public PlatformTransactionManager transactionManager() 
    {
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(hmDataSource());
        return transactionManager;
    }

}
