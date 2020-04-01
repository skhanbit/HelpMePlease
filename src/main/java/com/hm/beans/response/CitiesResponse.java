package com.hm.beans.response;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hm.beans.db.City;

public class CitiesResponse implements BaseResponseBean 
{
	@JsonProperty("state_id")
	private int stateId;
	
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

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}
}
