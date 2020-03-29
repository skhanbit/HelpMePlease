package com.hm.dao.db;

import com.hm.beans.request.UserBean;

public interface UserDAO 
{
	public void addUser(UserBean userBean);
	
	public UserBean getUser(String mobile);
	
	public void deleteUser(String mobile);
	
	public int updateUser(UserBean userBean);

}
