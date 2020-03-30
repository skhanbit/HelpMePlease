package com.hm.beans.response;

import java.util.ArrayList;
import java.util.List;

import com.hm.beans.db.State;

public class StatesResponse implements BaseResponseBean 
{
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

}
