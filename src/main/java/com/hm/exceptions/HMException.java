package com.hm.exceptions;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.hm.beans.response.HMError;

public class HMException extends RuntimeException 
{
	
	private static final Logger logger = LogManager.getLogger(HMException.class);

	private static final long serialVersionUID = -4433455541834051798L;

	private final long errorCode;

	private final String errorMessage;
	
	private final HMError error;
	
	private String detailedMessage;

	public HMException(final long errorCode, final String errorMsg) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMsg;
		this.error = new HMError(errorCode, errorMsg);
	}

	public HMException(final HMError error) {
		this(error.getErrorCode(), error.getErrorMsg());
	}

	public HMException(final long errorCode, final String errorMsg,
			final String detailedMessage) {
		this(errorCode, errorMsg);
		this.detailedMessage = detailedMessage;
	}

	public HMException(final long errorCode, final String errorMsg,
			final Throwable t) {
		super(t);
		this.errorCode = errorCode;
		this.errorMessage = errorMsg;
		this.error = new HMError(errorCode, errorMsg);
	}

	public HMException(final HMError error, final Throwable t) {
		this(error.getErrorCode(), error.getErrorMsg(), t);
	}

	public HMException(final long errorCode, final String errorMsg,
			final String detailedMessage, final Throwable t) {
		this(errorCode, errorMsg, t);
		this.detailedMessage = detailedMessage;
	}

	/**
	 * @return the errorCode
	 */
	public long getErrorCode() {
		return this.errorCode;
	}

	/**
	 * @return the errorMessage
	 */
	public String getErrorMessage() {
		return this.errorMessage;
	}

	/**
	 * @return the detailedMessage
	 */
	public String getDetailedMessage() {
		return this.detailedMessage;
	}

	/**
	 * @return the error
	 */
	public HMError getError() {
		return error;
	}

	public void logError(Object o) {
		logger.error("Exception Occured with Error code = {"
				+ this.getErrorCode() + "} & Error Message = {"
				+ this.getDetailedMessage() + "}");
		logger.error("State of the object logged = {" + o + "}");
		logger.error("Original Exception = {}", this.getCause());
	}
}
