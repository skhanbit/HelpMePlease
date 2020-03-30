package com.hm.dao.db;

import com.hm.beans.request.UserBean;
import com.hm.beans.response.UserDetailsResp;

public interface UserDAO 
{
	public void addUser(UserBean userBean);
	
	public UserDetailsResp getUser(UserBean userBean);
	
	public void deleteUser(String mobile);
	
	public int updateUser(UserBean userBean);

}
