package com.hm.beans.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.hm.beans.db.BaseBeanDb;

@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(Include.NON_NULL)
public class Organization extends BaseBeanDb
{
	private long id;
	
	@JsonProperty("org_name")
	private String orgName;
	
	@JsonProperty("mobile")
	private String mobileNumber;
	
	@JsonProperty("first_name")
	private String firstName; 
	
	@JsonProperty("middle_name")
	private String middleName;
	
	@JsonProperty("last_name")
	private String lastName;
	
	@JsonProperty("email")
	private String emailAddress;
	
	@JsonProperty("gps_location")
	private String gpsLocation;
	
	@JsonProperty("lat")
	private String latitude;
	
	@JsonProperty("long")
	private String longitue;
	
	@JsonProperty("address")
	private String address;
	
	@JsonProperty("city_id")
	private int cityId;
	
	@JsonProperty("org_type")
	private String organizationType;
	
	@JsonProperty("is_individual")
	private boolean isIndividual;
	
	@JsonProperty("can_accept")
	private boolean canAccept;
	
	@JsonProperty("is_active")
	private boolean isActive;

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
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

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getGpsLocation() {
		return gpsLocation;
	}

	public void setGpsLocation(String location) {
		this.gpsLocation = location;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitue() {
		return longitue;
	}

	public void setLongitue(String longitue) {
		this.longitue = longitue;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getOrganizationType() {
		return organizationType;
	}

	public void setOrganizationType(String organizationType) {
		this.organizationType = organizationType;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public boolean isCanAccept() {
		return canAccept;
	}

	public void setCanAccept(boolean canAccept) {
		this.canAccept = canAccept;
	}
	
	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public boolean isIndividual() {
		return isIndividual;
	}

	public void setIndividual(boolean isIndividual) {
		this.isIndividual = isIndividual;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	
	
	
}

//@JsonProperty("org_type")
//public enum organizationType
//{
//	@JsonProperty("SERVICE_PROVIDER") service_provider,
//    @JsonProperty("VOLUNTEER") volunteer;
//}



