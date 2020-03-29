package com.hm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hm.beans.request.UserBean;
import com.hm.beans.response.ResponseBean;
import com.hm.services.UserService;


@Controller(value = "/user")
public class UserController 
{
	@Autowired
	private UserService helpService;
	
	@PostMapping(value="/add")
	@ResponseBody
	ResponseBean addUser(@RequestBody UserBean requestBean)
	{
		return helpService.addUser(requestBean);
	}
	
	@PostMapping(value="/update")
	@ResponseBody
	ResponseBean updateUser(@RequestBody UserBean requestBean)
	{
		return helpService.updateUser(requestBean);
	}
	
	@PostMapping(value="/delete")
	@ResponseBody
	ResponseBean deleteUser(@RequestBody UserBean requestBean)
	{
		return helpService.deleteUser(requestBean);
	}
	
	@PostMapping(value="/get")
	@ResponseBody
	ResponseBean getUser(@RequestBody UserBean requestBean)
	{
		return helpService.getUser(requestBean);
	}

}