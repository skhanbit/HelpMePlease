package com.hm.dao.db;

import java.util.List;

import com.hm.beans.db.City;
import com.hm.beans.db.Country;
import com.hm.beans.db.State;

public interface LocaleDAO 
{
	public Country getCountry();
		
	public List<State> getStates(String countryId);
		
	public List<City> getCities(String stateId);

}