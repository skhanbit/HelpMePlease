package com.hm.beans.response;

import com.hm.beans.db.Country;

public class CountryResponse implements BaseResponseBean  
{
	private Country country;

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

}
