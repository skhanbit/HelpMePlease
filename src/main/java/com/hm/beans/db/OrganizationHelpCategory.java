package com.hm.beans.db;

public class OrganizationHelpCategory extends BaseBeanDb
{
	private long id;
	
	private long organizationId;
	
	private long helpCategoryId;
	
	private boolean isActive;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(long organizationId) {
		this.organizationId = organizationId;
	}

	public long getHelpCategoryId() {
		return helpCategoryId;
	}

	public void setHelpCategoryId(long helpCategoryId) {
		this.helpCategoryId = helpCategoryId;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	
	
	

}
