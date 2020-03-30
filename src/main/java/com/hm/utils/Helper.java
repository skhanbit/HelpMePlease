package com.hm.utils;

import com.hm.exceptions.HMErrorCode;
import com.hm.exceptions.HMErrorMsg;
import com.hm.exceptions.HMException;

public class Helper {
	
	public static boolean isNUllOrEmpty(String str)
	{
		return (str==null || str.trim().length() == 0) ? true : false;
	}
	
	public static boolean isNUllOrEmpty(String str, boolean throwException) throws HMException
	{
		if(isNUllOrEmpty(str) == true)
		{
			if(throwException)
				throw new HMException(HMErrorCode.EMPTY_STRING, HMErrorMsg.EMPTY_STRING + "::" + str);
		}
		
		return false;
	}

}
