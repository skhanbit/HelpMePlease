package com.hm.beans.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.hm.beans.db.BaseBeanDb;
import com.hm.exceptions.HMErrorCode;
import com.hm.exceptions.HMErrorMsg;
import com.hm.exceptions.HMException;
import com.hm.utils.Helper;

@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(Include.NON_NULL)
public class UserBean extends BaseBeanDb
{
	private long id;
	
	@JsonProperty("mobile_number")
	private String mobileNumber;
	
	@JsonProperty("first_name")
	private String firstName;
	
	@JsonProperty("middle_name")
	private String middleName;
	
	@JsonProperty("last_name")
	private String lastName;
	
	@JsonProperty("email_address")
	private String email;
	
	@JsonProperty("gps_location")
	private String gpsLocation;
	
	@JsonProperty("lat")
	private String latitude;
	
	@JsonProperty("long")
	private String longitude;
	
	@JsonProperty("address")
	private String address;
	
	@JsonProperty("city_id")
	private String cityId;
	
	@JsonProperty("is_admin")
	private boolean isAdmin;
	
	@JsonProperty("userType")
	private String user_type;
	
	@JsonProperty("organization_id")
	private long organizationId;
	
	@JsonProperty("otp")
	private String otp;
	
	
	public void validate()
	{
		if( Helper.isNUllOrEmpty(mobileNumber) )
		{
			throw new HMException(HMErrorCode.EMPTY_STRING, HMErrorMsg.EMPTY_STRING + "::" + mobileNumber);
		}
		
		if( Helper.isNUllOrEmpty(otp) )
		{
			throw new HMException(HMErrorCode.EMPTY_STRING, HMErrorMsg.EMPTY_STRING + "::" + otp);
		}
		
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGpsLocation() {
		return gpsLocation;
	}

	public void setGpsLocation(String gpsLocation) {
		this.gpsLocation = gpsLocation;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public String getUser_type() {
		return user_type;
	}

	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}

	public long getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(long organizationId) {
		this.organizationId = organizationId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}
	
	
	
}
