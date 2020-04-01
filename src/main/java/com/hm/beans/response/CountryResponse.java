package com.hm.beans.response;

import java.util.List;

import com.hm.beans.db.Country;

public class CountryResponse implements BaseResponseBean  
{
	private List<Country> country;

	public List<Country> getCountry() {
		return country;
	}

	public void setCountry(List<Country> country) {
		this.country = country;
	}


}
