package com.hm.beans.db;

public class State extends Locale 
{
	
	private int countryId;
	
	@Override
	protected void type() 
	{
		this.type = "STATE";
	}

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

}
