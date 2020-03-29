package com.hm.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hm.beans.request.UserBean;
import com.hm.beans.response.HMError;
import com.hm.beans.response.ResponseBean;
import com.hm.beans.response.ResponseBuilder;
import com.hm.beans.response.UserDetails;
import com.hm.dao.db.UserDAO;
import com.hm.exceptions.HMErrorUtil;
import com.hm.exceptions.HMException;
import com.hm.services.UserService;
import com.hm.utils.LogUtils;

@Service
public class UserServiceImpl implements UserService 
{
	@Autowired
	UserDAO userDAO;

	@Override
	public ResponseBean getUser(UserBean requestBean) 
	{
		
		ResponseBuilder     builder = new ResponseBuilder();
		HMError   error = new HMError();
		UserDetails data = new UserDetails();
		try 
		{
			// Set response JSON data here
//			data.setUserName("SOME_USER_NAME");
//			data.setPassword("SOME_PASSWORD");

		} catch (HMException e) {
			LogUtils.error("error", e);
			error = HMErrorUtil.getError(e);
		}
		
		builder.setError(error);
		builder.setData(data);
		
		return builder.build();
	}

	@Override
	public ResponseBean addUser(UserBean requestBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseBean updateUser(UserBean requestBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseBean deleteUser(UserBean requestBean) {
		// TODO Auto-generated method stub
		return null;
	}

}
