package com.hm.beans.db;

public class City extends Locale 
{
	private int stateId;
	
	@Override
	protected void type() 
	{
		this.type = "CITY";
	}

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

}
