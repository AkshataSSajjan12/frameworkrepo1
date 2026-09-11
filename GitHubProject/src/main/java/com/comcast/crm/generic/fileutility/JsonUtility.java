package com.comcast.crm.generic.fileutility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonUtility {
	public String readDataFromJsonFile(String key) throws IOException, ParseException
	{
		FileReader filer = new FileReader("./configAppdata/appcommondata.json");
		JSONParser json = new JSONParser();
		Object jobj = json.parse(filer);
		JSONObject map = (JSONObject) jobj;
		String data =map.get(key).toString();
		return data;
		
	}

}
