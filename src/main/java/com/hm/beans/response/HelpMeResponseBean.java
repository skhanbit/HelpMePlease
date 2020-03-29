package com.hm.beans.response;

public class HelpMeResponseBean<T> 
{
	private HMError error;
	
	private T data;
	
	public HMError getError() {
		return error;
	}

	public void setError(HMError error) {
		this.error = error;
	}

	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data =data;
	}
}
