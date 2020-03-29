package com.hm.beans.db;

public class HelpItemHistory extends BaseBeanDb 
{
	private long id;
	
	private long helpItemId;
	
	private String remarks;
	
	private String helpItemStatus;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getHelpItemId() {
		return helpItemId;
	}

	public void setHelpItemId(long helpItemId) {
		this.helpItemId = helpItemId;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getHelpItemStatus() {
		return helpItemStatus;
	}

	public void setHelpItemStatus(String helpItemStatus) {
		this.helpItemStatus = helpItemStatus;
	}
	
	

}
