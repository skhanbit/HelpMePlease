package com.hm.services;

import com.hm.beans.request.Organization;
import com.hm.beans.response.ResponseBean;

public interface OrganizationService 
{
	ResponseBean addOrg(Organization requestBean);
	
	ResponseBean updateOrg(Organization requestBean);
	
	ResponseBean deleteOrg(Organization requestBean);
	
	ResponseBean getOrg(Organization requestBean);

}
