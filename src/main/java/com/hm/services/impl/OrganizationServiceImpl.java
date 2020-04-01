package com.hm.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hm.beans.request.Organization;
import com.hm.beans.response.ResponseBean;
import com.hm.dao.db.OrganizationDAO;
import com.hm.services.OrganizationService;

@Component
public class OrganizationServiceImpl implements OrganizationService {

	@Autowired
	OrganizationDAO orgDAO;
	
	@Override
	public ResponseBean addOrg(Organization requestBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseBean updateOrg(Organization requestBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseBean deleteOrg(Organization requestBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseBean getOrg(Organization requestBean) {
		// TODO Auto-generated method stub
		return null;
	}

}
