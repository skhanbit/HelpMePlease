package com.hm.beans.db;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class State
{
	private long id;
	
	private String name;
	
	@JsonIgnore
	private int countryId;
	
	@JsonIgnore
	private Date creationDate;
	
	@JsonIgnore
	private Date modificationDate;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getModificationDate() {
		return modificationDate;
	}

	public void setModificationDate(Date modificationDate) {
		this.modificationDate = modificationDate;
	}
	
	

}
