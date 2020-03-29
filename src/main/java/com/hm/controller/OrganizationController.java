package com.hm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hm.beans.request.Organization;
import com.hm.beans.response.ResponseBean;
import com.hm.services.OrganizationService;

@Controller(value = "/organization")
public class OrganizationController 
{
	@Autowired
	private OrganizationService orgService;
	
	@PostMapping(value="/add")
	@ResponseBody
	ResponseBean addOrg(@RequestBody Organization requestBean)
	{
		return orgService.addOrg(requestBean);
	}
	
	@PostMapping(value="/update")
	@ResponseBody
	ResponseBean updateOrg(@RequestBody Organization requestBean)
	{
		return orgService.updateOrg(requestBean);
	}
	
	@PostMapping(value="/delete")
	@ResponseBody
	ResponseBean deleteOrg(@RequestBody Organization requestBean)
	{
		return orgService.deleteOrg(requestBean);
	}
	
	@PostMapping(value="/get")
	@ResponseBody
	ResponseBean getOrg(@RequestBody Organization requestBean)
	{
		return orgService.getOrg(requestBean);
	}
	
}
