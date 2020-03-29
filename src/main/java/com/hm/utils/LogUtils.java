package com.hm.utils;

import org.apache.log4j.Logger;


public class LogUtils {

	private static Logger logger = null;
	static {
		logger = LogUtils.getLogger(LogUtils.class);
	}

	@SuppressWarnings("rawtypes")
	private static synchronized Logger getLogger(Class clazz) {
		Logger logger = Logger.getLogger(clazz);
		return logger;
	}

	public static void trace(Object msg) {
		logger.trace(msg);
	}

	public static void trace(Object msg, Throwable t) {
		logger.trace(msg, t);
	}

	public static void debug(String msg) {
		logger.debug(msg);
	}

	public static void debug (String msg, Throwable t) {
		logger.debug(msg, t);
	}

	public static void info(String msg) {
		logger.info(msg);
	}

	public static void error (String msg) {
		logger.error(msg);
	}

	public static void error (String msg, Throwable t) {
		logger.error(msg, t);
	}   

	public static boolean isInfoEnabled () {
		return logger.isInfoEnabled();
	}

	public static boolean isDebugEnabled () {
		return logger.isDebugEnabled();
	}

	public static void info(Class<?> clazz, String msg) {
		LogUtils.getLogger(clazz).info(msg);
	}

	public static void debug(Class<?> clazz, String msg) {
		LogUtils.getLogger(clazz).debug(msg);
	}

	public static void debug (Class<?> clazz, String msg, Throwable t) {
		LogUtils.getLogger(clazz).debug(msg, t);
	}   

	public static void error(Class<?> clazz, String msg) {
		LogUtils.getLogger(clazz).debug(msg);
	}

	public static void error (Class<?> clazz, String msg, Throwable t) {
		LogUtils.getLogger(clazz).error(msg, t);
	}   

	public static void trace(Class<?> clazz, Object msg) {
		LogUtils.getLogger(clazz).trace(msg);
	}

	public static void trace (Class<?> clazz, Object msg, Throwable t) {
		LogUtils.getLogger(clazz).trace(msg, t);
	}   
}
