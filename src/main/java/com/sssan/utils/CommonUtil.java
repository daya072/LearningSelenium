package com.sssan.utils;

public class CommonUtil {
	
	public static boolean isNotNullAndEmpty(String element) {
		boolean flag=false;
		if(element!=null && !element.isEmpty()) {
			flag=true;
		}
		return flag;
	}

}
