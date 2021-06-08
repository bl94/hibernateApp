package com.luv2code.hibernate.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

	private static SimpleDateFormat formatData = new SimpleDateFormat("dd/MM/yyyy");
	
	// read string and convert/parse to date
	
	public static Date parseDate(String dateStr) throws ParseException{
		Date date=null;
		if(dateStr!=null) {
		date = formatData.parse(dateStr);
		}
		return date;
	}
		//read string and convert/parse to string
	public static String convertDateToString(Date date) {
		String dateStr=null;
		if(date!=null) {
		dateStr=formatData.format(date);
		}
		return dateStr;
	}
		
	
}
