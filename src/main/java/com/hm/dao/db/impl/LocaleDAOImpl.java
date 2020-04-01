package com.hm.dao.db.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;

import com.hm.beans.db.City;
import com.hm.beans.db.Country;
import com.hm.beans.db.State;
import com.hm.dao.db.LocaleDAO;
import com.hm.dao.db.Queries;
import com.hm.exceptions.HMErrorCode;
import com.hm.exceptions.HMErrorMsg;
import com.hm.exceptions.HMException;
import com.hm.utils.LogUtils;

@Component
public class LocaleDAOImpl implements LocaleDAO 
{
	@Autowired
	@Qualifier("hm")
	private JdbcTemplate hmTemplate;

	@Override
	public List<Country> getCountry() 
	{
		final List<Country> countryList = new ArrayList<Country>();
		try {
			getHmTemplate().query(Queries.getCountryMaster(),new ResultSetExtractor<Object>() {

				public Object extractData(ResultSet rs) throws SQLException, DataAccessException {
					
					while (rs.next()) {
						Country bean = new Country();
						bean.setId(rs.getInt("id"));
						bean.setName(rs.getString("name"));
						countryList.add(bean);
					}
					return null;
				}
			});
		}catch(DataAccessException e){
			LogUtils.error(LocaleDAOImpl.class, "Error getCountry", e);
			throw new HMException(HMErrorCode.DATABASE_ERROR, HMErrorMsg.SYSTEM_ERROR, e);
		}
		return countryList;
	}

	@Override
	public List<State> getStates(String countryId) 
	{
		final List<State> stateList = new ArrayList<State>();
		try {
			getHmTemplate().query(Queries.getStates(),new Object[] { countryId }, new ResultSetExtractor<Object>() {

				public Object extractData(ResultSet rs) throws SQLException, DataAccessException {
					
					while (rs.next()) {
						State bean = new State();
						bean.setId(rs.getInt("id"));
						bean.setName(rs.getString("name"));
						bean.setCountryId(rs.getInt("country_id"));
						stateList.add(bean);
					}
					return null;
				}
			});
		}catch(DataAccessException e){
			LogUtils.error(LocaleDAOImpl.class, "Error getStates", e);
			throw new HMException(HMErrorCode.DATABASE_ERROR, HMErrorMsg.SYSTEM_ERROR, e);
		}
		return stateList;
		
	}

	@Override
	public List<City> getCities(String stateId) 
	{
		final List<City> cityList = new ArrayList<City>();
		try {
			getHmTemplate().query(Queries.getCities(),new Object[] { stateId }, new ResultSetExtractor<Object>() {

				public Object extractData(ResultSet rs) throws SQLException, DataAccessException {
					
					while (rs.next()) {
						City bean = new City();
						bean.setId(rs.getInt("id"));
						bean.setName(rs.getString("name"));
						bean.setStateId(rs.getInt("state_id"));
						cityList.add(bean);
					}
					return null;
				}
			});
		}catch(DataAccessException e){
			LogUtils.error(LocaleDAOImpl.class, "Error getCities", e);
			throw new HMException(HMErrorCode.DATABASE_ERROR, HMErrorMsg.SYSTEM_ERROR, e);
		}
		return cityList;
	}

	public JdbcTemplate getHmTemplate() {
		return hmTemplate;
	}

	public void setHmTemplate(JdbcTemplate hmTemplate) {
		this.hmTemplate = hmTemplate;
	}

}
