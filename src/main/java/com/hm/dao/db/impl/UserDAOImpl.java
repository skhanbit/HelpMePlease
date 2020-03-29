package com.hm.dao.db.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.hm.beans.request.UserBean;
import com.hm.dao.db.UserDAO;

public class UserDAOImpl implements UserDAO
{
	@Autowired
	@Qualifier("hm")
	private JdbcTemplate hmTemplate;
	
	@Autowired
	@Qualifier("namedHm")
	private NamedParameterJdbcTemplate hmNamedParamTemplate;
	
	@Override
	public void addUser(UserBean userBean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UserBean getUser(String mobile) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(String mobile) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int updateUser(UserBean userBean) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public JdbcTemplate getHmTemplate() {
		return hmTemplate;
	}

	public void setHmTemplate(JdbcTemplate hmTemplate) {
		this.hmTemplate = hmTemplate;
	}

	public NamedParameterJdbcTemplate getHmNamedParamTemplate() {
		return hmNamedParamTemplate;
	}

	public void setHmNamedParamTemplate(NamedParameterJdbcTemplate hmNamedParamTemplate) {
		this.hmNamedParamTemplate = hmNamedParamTemplate;
	}

}
