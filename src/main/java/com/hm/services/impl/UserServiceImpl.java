package com.hm.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hm.beans.request.UserBean;
import com.hm.beans.response.HMError;
import com.hm.beans.response.ResponseBean;
import com.hm.beans.response.ResponseBuilder;
import com.hm.beans.response.UserDetailsResp;
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
	public ResponseBean getUser(String mobileNumber, String otp) 
	{
		ResponseBuilder     builder = new ResponseBuilder();
		HMError   error = new HMError();
		UserDetailsResp data = new UserDetailsResp();
		try 
		{
			UserBean userBean = getUserRequestBean(mobileNumber, otp);
			
			//validate for inputs params
			userBean.validate();
		
			// Fetch user Details from DB
			userDAO.getUser(userBean);
			

		} catch (HMException e) {
			LogUtils.error("error", e);
			error = HMErrorUtil.getError(e);
		}
		
		builder.setError(error);
		builder.setData(data);
		
		return builder.build();
	}

	private UserBean getUserRequestBean(String mobileNumber, String otp) {
		UserBean userBean = new UserBean();
		userBean.setMobileNumber(mobileNumber);
		userBean.setOtp(otp);
		return userBean;
	}

	@Override
	public ResponseBean addUser(UserBean requestBean) 
	{
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
