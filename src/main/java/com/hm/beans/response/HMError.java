package com.hm.beans.response;


public class HMError 
{
	private boolean isError;
	
	private long errorCode;
	
	private String errorMsg;

	public HMError() {
	}

	public boolean isError() {
		return isError;
	}

	public void setError(boolean isError) {
		this.isError = isError;
	}

	public long getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(long errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public HMError(long errorCode, String errorMsg) {
		this.isError = true;
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}

}
