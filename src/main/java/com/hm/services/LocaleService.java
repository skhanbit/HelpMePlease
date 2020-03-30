package com.hm.services;

import com.hm.beans.response.ResponseBean;

public interface LocaleService 
{
	ResponseBean getCountries();
	
	ResponseBean getStates(String countryId);
	
	ResponseBean getCities(String stateId);
	
}
