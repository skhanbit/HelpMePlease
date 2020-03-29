package com.hm.dao.db;

import com.hm.beans.request.Organization;
import com.hm.beans.request.UserBean;

public interface OrganizationDAO 
{
	public void addOrg(Organization bean);
	
	public UserBean getOrg(long userId);
	
	public void deleteOrg(Organization bean);
	
	public int updateOrg(Organization bean);

}
