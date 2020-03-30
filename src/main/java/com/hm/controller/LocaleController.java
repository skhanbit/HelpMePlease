package com.hm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hm.beans.response.ResponseBean;
import com.hm.services.LocaleService;
import com.sun.istack.NotNull;

@Controller
public class LocaleController 
{
	@Autowired
	LocaleService localeService;
	
	@GetMapping(value="/countries")
	@ResponseBody
	ResponseBean getCountries()
	{
		return localeService.getCountries();
	}
	
	@GetMapping(value="/states")
	@ResponseBody
	ResponseBean getStates(@RequestParam @NotNull String countryId)
	{
		return localeService.getStates(countryId);
	}
	
	@GetMapping(value="/cities")
	@ResponseBody
	ResponseBean getCities(@RequestParam @NotNull String stateId)
	{
		return localeService.getCities(stateId);
	}

}
