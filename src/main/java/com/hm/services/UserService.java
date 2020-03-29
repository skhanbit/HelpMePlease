package com.hm.services;

import com.hm.beans.request.UserBean;
import com.hm.beans.response.ResponseBean;

public interface UserService 
{
	ResponseBean addUser(UserBean requestBean);
	
	ResponseBean updateUser(UserBean requestBean);
	
	ResponseBean deleteUser(UserBean requestBean);
	
	ResponseBean getUser(UserBean requestBean);

}
