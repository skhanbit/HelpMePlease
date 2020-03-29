package com.hm.beans.db;

import java.sql.Date;

public class Locale 
{
	private long id;
	
	private String name;
	
	protected String type;
	
	private Date creationDate;
	
	private Date modificationDate;
	
	
	protected void type()
	{
		type=null;
	}


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


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
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
