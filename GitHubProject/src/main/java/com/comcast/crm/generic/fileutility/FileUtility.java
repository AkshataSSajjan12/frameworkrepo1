package com.comcast.crm.generic.fileutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	public String toReadDataFromPropertiesFile(String key) throws IOException
	{
		FileInputStream pfis = new FileInputStream("./configAppdata/commondata.properties");
		Properties prop = new Properties();
		prop.load(pfis);
		String data= prop.getProperty(key);
		return data;
	}

}
