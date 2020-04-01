package com.hm.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hm.beans.response.CitiesResponse;
import com.hm.beans.response.CountryResponse;
import com.hm.beans.response.HMError;
import com.hm.beans.response.ResponseBean;
import com.hm.beans.response.ResponseBuilder;
import com.hm.beans.response.StatesResponse;
import com.hm.dao.db.LocaleDAO;
import com.hm.exceptions.HMErrorUtil;
import com.hm.exceptions.HMException;
import com.hm.services.LocaleService;
import com.hm.utils.LogUtils;

@Component
public class LocaleServiceImpl implements LocaleService 
{
	@Autowired
	LocaleDAO localeDAO;

	@Override
	public ResponseBean getCountries() 
	{
		ResponseBuilder     builder = new ResponseBuilder();
		HMError   error = new HMError();
		CountryResponse data = new CountryResponse();
		try 
		{
			data.setCountry( localeDAO.getCountry() );
		} catch (HMException e) {
			LogUtils.error("error", e);
			error = HMErrorUtil.getError(e);
		}
		builder.setError(error);
		builder.setData(data);
		return builder.build();
	}

	@Override
	public ResponseBean getStates(String countryId) 
	{
		ResponseBuilder     builder = new ResponseBuilder();
		HMError   error = new HMError();
		StatesResponse data = new StatesResponse();
		try 
		{
			data.setCountryId(Integer.valueOf(countryId));
			data.setStateList( localeDAO.getStates(countryId) );
		} catch (HMException e) {
			LogUtils.error("error", e);
			error = HMErrorUtil.getError(e);
		}
		builder.setError(error);
		builder.setData(data);
		return builder.build();
		
	}

	@Override
	public ResponseBean getCities(String stateId) 
	{
		ResponseBuilder     builder = new ResponseBuilder();
		HMError   error = new HMError();
		CitiesResponse data = new CitiesResponse();
		try 
		{
			data.setStateId(Integer.valueOf(stateId));
			data.setCityList( localeDAO.getCities(stateId) );
		} catch (HMException e) {
			LogUtils.error("error", e);
			error = HMErrorUtil.getError(e);
		}
		builder.setError(error);
		builder.setData(data);
		return builder.build();
	}

}
