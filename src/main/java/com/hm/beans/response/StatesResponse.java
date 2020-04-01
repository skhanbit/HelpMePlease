package com.hm.beans.response;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hm.beans.db.State;

public class StatesResponse implements BaseResponseBean 
{
	@JsonProperty("country_id")
	private int countryId;
	
	private List<State> stateList;
	
	public StatesResponse()
	{
		setStateList(new ArrayList<State>());
	}

	public List<State> getStateList() {
		return stateList;
	}

	public void setStateList(List<State> stateList) {
		this.stateList = stateList;
	}

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

}
