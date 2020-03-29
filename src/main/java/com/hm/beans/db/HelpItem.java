package com.hm.beans.db;

public class HelpItem extends BaseBeanDb 
{
	private long userId;
	
	private int helpCategoryId;
	
	private String helpText;
	
	//TODO: Convert to enum
	private String helpStatus;
	
	private long assignedUserId;
	
	private long volunteerUserId;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public int getHelpCategoryId() {
		return helpCategoryId;
	}

	public void setHelpCategoryId(int helpCategoryId) {
		this.helpCategoryId = helpCategoryId;
	}

	public String getHelpText() {
		return helpText;
	}

	public void setHelpText(String helpText) {
		this.helpText = helpText;
	}

	public String getHelpStatus() {
		return helpStatus;
	}

	public void setHelpStatus(String helpStatus) {
		this.helpStatus = helpStatus;
	}

	public long getAssignedUserId() {
		return assignedUserId;
	}

	public void setAssignedUserId(long assignedUserId) {
		this.assignedUserId = assignedUserId;
	}

	public long getVolunteerUserId() {
		return volunteerUserId;
	}

	public void setVolunteerUserId(long volunteerUserId) {
		this.volunteerUserId = volunteerUserId;
	}

}
