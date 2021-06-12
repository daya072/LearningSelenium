package com.sssan.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.sssan.exception.CustomException;

public class PropertiesUtil {

	private static Properties properties;
	public static void loadProperties() throws CustomException {
		properties = new Properties();
		ClassLoader classLoader = PropertiesUtil.class.getClassLoader();
		try (InputStream is = classLoader.getResourceAsStream("application.properties")) {
		  properties.load(is);
		}
		catch(IOException e) {
			throw new CustomException("Error in loading properties file");
		}
	}
	
	public static String getApplicationProperty(String key) throws CustomException{
		String value = null;
		if(CommonUtil.isNotNullAndEmpty(properties.getProperty(key).trim())) {
			value = properties.getProperty(key).trim();
			return value;
		}
		else {
			throw new CustomException("Either the key does not exist or the key value is null or empty, Key:"+key);
		}
	}
	

}
