package com.hm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hm.beans.request.UserBean;
import com.hm.beans.response.ResponseBean;
import com.hm.services.UserService;


@Controller
@RequestMapping("/user")
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
	
	@GetMapping(value="/get")
	@ResponseBody
	ResponseBean getUser(@RequestParam String mobileNumber, @RequestParam String otp)
	{
		return helpService.getUser(mobileNumber,otp);
	}
}