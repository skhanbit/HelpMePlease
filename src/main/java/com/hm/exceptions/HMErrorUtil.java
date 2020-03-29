package com.hm.exceptions;

import com.hm.beans.response.HMError;

public class HMErrorUtil 
{
	public static HMError getError()
	{
		HMError error = new HMError();
		error.setError(false);
		return error;
	}
	
	public static HMError getError(final long errorCode, final String errorMsg)
	{
		HMError error = new HMError();
		error.setError(Boolean.TRUE);
		error.setErrorCode(errorCode);
		error.setErrorMsg(errorMsg);
		return error;
	}

	public static HMError getError(HMException e) 
	{
		HMError error = new HMError();
		error.setError(Boolean.TRUE);
		if(e != null){
			error.setErrorCode(e.getErrorCode());
			error.setErrorMsg(e.getDetailedMessage() != null ? e.getDetailedMessage() : e.getErrorMessage());
		} else {
			error.setErrorCode(HMErrorCode.SYSTEM_ERROR);
			error.setErrorMsg(HMErrorMsg.SYSTEM_ERROR);
		}
		return error;
	}
}
