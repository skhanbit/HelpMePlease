package com.hm.dao.db.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.hm.beans.db.City;
import com.hm.beans.db.Country;
import com.hm.beans.db.State;
import com.hm.dao.db.LocaleDAO;
import com.hm.dao.db.Queries;
import com.hm.exceptions.HMErrorCode;
import com.hm.exceptions.HMException;
import com.hm.utils.LogUtils;


public class LocaleDAOImpl implements LocaleDAO 
{
	@Autowired
	@Qualifier("hm")
	private JdbcTemplate hmTemplate;

	@Override
	public Country getCountry() 
	{
		try {
			return getHmTemplate().queryForObject(Queries.getCountryMaster(), new BeanPropertyRowMapper<Country>(Country.class));
		} catch (DataAccessException e) {
			LogUtils.error(LocaleDAOImpl.class, "Error getCountry", e);
			throw new HMException(HMErrorCode.DATABASE_ERROR, "Error-getCountry{}", e);
		}
	}

	@Override
	public List<State> getStates(String countryId) 
	{
		try {
			return getHmTemplate().queryForList( Queries.getStates(), new Object[] { countryId }, State.class );
		} catch (DataAccessException e) {
			LogUtils.error(LocaleDAOImpl.class, "Error getStates{countryId ::"+countryId+"}", e);
			throw new HMException(HMErrorCode.DATABASE_ERROR, "Error-getStates{}", e);
		}
	}

	@Override
	public List<City> getCities(String stateId) 
	{
		try {
			return getHmTemplate().queryForList( Queries.getCities(), new Object[] { stateId }, City.class );
		} catch (DataAccessException e) {
			LogUtils.error(LocaleDAOImpl.class, "Error getCities{stateId ::"+stateId+"}", e);
			throw new HMException(HMErrorCode.DATABASE_ERROR, "Error-getCities{}", e);
		}
	}

	public JdbcTemplate getHmTemplate() {
		return hmTemplate;
	}

	public void setHmTemplate(JdbcTemplate hmTemplate) {
		this.hmTemplate = hmTemplate;
	}

}
