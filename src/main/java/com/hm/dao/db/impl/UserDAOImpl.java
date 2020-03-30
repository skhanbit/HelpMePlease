package com.hm.dao.db.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.hm.beans.request.UserBean;
import com.hm.beans.response.UserDetailsResp;
import com.hm.dao.db.Queries;
import com.hm.dao.db.UserDAO;
import com.hm.exceptions.HMErrorCode;
import com.hm.exceptions.HMException;

public class UserDAOImpl implements UserDAO
{
	@Autowired
	@Qualifier("hm")
	private JdbcTemplate hmTemplate;
	
	@Autowired
	@Qualifier("namedHm")
	private NamedParameterJdbcTemplate hmNamedParamTemplate;
	
	@Override
	public void addUser(UserBean userBean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UserDetailsResp getUser(UserBean userBean) 
	{
		UserDetailsResp dbUserBean = new UserDetailsResp();
		try {
			 getHmTemplate().query(Queries.getUsers(),new ResultSetExtractor<Object>() {

				public Object extractData(ResultSet rs) throws SQLException, DataAccessException {

					while (rs.next()) {
						

					}
					return null;
				}
			});
		}catch(DataAccessException e){
			throw new HMException(HMErrorCode.DATABASE_ERROR, "Error-getUser{mobile :"+userBean.getMobileNumber()+"}", e);
		}
		return null;
	}
	
	@Override
	public void deleteUser(String mobile) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int updateUser(UserBean userBean) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public JdbcTemplate getHmTemplate() {
		return hmTemplate;
	}

	public void setHmTemplate(JdbcTemplate hmTemplate) {
		this.hmTemplate = hmTemplate;
	}

	public NamedParameterJdbcTemplate getHmNamedParamTemplate() {
		return hmNamedParamTemplate;
	}

	public void setHmNamedParamTemplate(NamedParameterJdbcTemplate hmNamedParamTemplate) {
		this.hmNamedParamTemplate = hmNamedParamTemplate;
	}

}
