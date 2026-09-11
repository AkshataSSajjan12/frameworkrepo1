package com.comcast.crm.generic.webdriverutility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	public int toGetRandomNumber()
	{
		Random random = new Random();
		int randomnum = random.nextInt();
		return randomnum;
	}
	
	public String toGetSystemDateyyyyMMdd()
	{
		Date dateobj = new Date();
		SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
		String currentdate= sim.format(dateobj);
		 return currentdate;
	
	}
	
	public String toGetRequireDateyyyyMMdd(int days)
	{
		
		SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = sim.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH, days);
		String requiredate = sim.format(cal.getTime());
		return requiredate;
		
		
	
	}
	

}
