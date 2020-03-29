package com.hm.beans.response;


public class ResponseBuilder 
{
	private HMError error;
	
	private BaseResponseBean data;
	
	public ResponseBuilder() {}
	
	public ResponseBuilder(BaseResponseBean data, HMError error) {
		this.data = data;
		this.error = error;
	}
	
	public ResponseBean build() {
		return new ResponseBean(this);
	}

	public HMError getError() {
		return error;
	}

	public BaseResponseBean getData() {
		return data;
	}

	public void setError(HMError error) {
		this.error = error;
	}

	public void setData(BaseResponseBean data) {
		this.data = data;
	}
}
