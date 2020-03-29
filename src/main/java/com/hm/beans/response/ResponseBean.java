package com.hm.beans.response;

public class ResponseBean 
{
	private HMError error;

	private BaseResponseBean data;

	ResponseBean() {}

	public ResponseBean(ResponseBuilder builder) {
		if(builder.getError()!=null && builder.getError().isError()) {
			this.setError(builder.getError());
		}else {
			this.setData(builder.getData());
		}
	}

	public HMError getError() {
		return error;
	}
	
	private void setError(HMError error) {
		this.error = error;
	}

	/**
	 * @return the data
	 */
	 public BaseResponseBean getData() {
		 return data;
	 }

	 /**
	  * @param data the data to set
	  */
	 private void setData(BaseResponseBean data) {
		 this.data = data;
	 }

	 @Override
	 public String toString() {
		 return "ResponseBean [error=" + error + ", data=" + data + "]";
	 }
}
