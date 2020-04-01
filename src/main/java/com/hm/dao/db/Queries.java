package com.hm.dao.db;

public class Queries {
	
	public static String getUsers() 
	{
		return new StringBuilder().append(
			"SELECT id,mobile_number,first_name,middle_name,last_name,email_address,gps_location,address,city_id,is_admin, user_type, "
			+ "organization_id, is_active, create_dt").append (
			"WHERE mobile_number = ?").toString();
	}
	
	
	public static String getCountryMaster() 
	{
		return new StringBuilder().append(
			"select id,name from help_me_please.country").toString();
	}
	
	public static String getStates() 
	{
		return new StringBuilder().append(
			"select id,name,country_id from help_me_please.state where country_id=?").toString();
	}
	
	
	public static String getCities() 
	{
		return new StringBuilder().append(
			"select id,name,state_id from help_me_please.city where state_id=?").toString();
	}
	
	
	public static String getHelpCategoryMaster() 
	{
		return new StringBuilder().append(
			"SELECT id,name,is_active,creation_date from help_category").toString();
	}
	
	

}
