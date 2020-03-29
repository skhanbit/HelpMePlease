package com.hm.dao.db.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;

import com.hm.beans.request.Organization;
import com.hm.beans.request.UserBean;
import com.hm.dao.db.OrganizationDAO;

public class OrganizationDAOImpl implements OrganizationDAO {

	@Autowired
	@Qualifier("hm")
	private JdbcTemplate hmTemplate;
	
	@Override
	public void addOrg(Organization bean) {
		// TODO Auto-generated method stub

	}

	@Override
	public UserBean getOrg(long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteOrg(Organization bean) {
		// TODO Auto-generated method stub

	}

	@Override
	public int updateOrg(Organization bean) {
		// TODO Auto-generated method stub
		return 0;
	}

}
