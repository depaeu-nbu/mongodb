package com.junglone.common.util;

public class StringUtil {

	public static boolean isBlank(String strInput) {
		return null == strInput || strInput.length() == 0 || strInput.trim().length() == 0 || "".equals(strInput);
	}

	public static boolean notBlank(String strInput) {
		return !isBlank(strInput);
	}

}
