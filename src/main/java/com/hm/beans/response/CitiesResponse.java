package com.hm.beans.response;

import java.util.ArrayList;
import java.util.List;

import com.hm.beans.db.City;

public class CitiesResponse implements BaseResponseBean 
{
	private List<City> cityList;
	
	public CitiesResponse()
	{
		setCityList(new ArrayList<City>());
	}

	public List<City> getCityList() {
		return cityList;
	}

	public void setCityList(List<City> cityList) {
		this.cityList = cityList;
	}
}
