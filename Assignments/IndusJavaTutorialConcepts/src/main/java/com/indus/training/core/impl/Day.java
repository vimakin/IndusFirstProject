package com.indus.training.core.impl;

import com.indus.training.core.svc.ADay;

public final class Day extends ADay {

	public static final Day SUNDAY = new Day("Sunday");
	public static final Day MONDAY = new Day("Monday");
	public static final Day TUESDAY = new Day("Tuesday");
	public static final Day WEDNESDAY = new Day("Wednesday");
	public static final Day THURSDAY = new Day("Thursday");
	public static final Day FRIDAY = new Day("Friday");
	public static final Day SATURDAY = new Day("Saturday");	
	
	// Declaring day name private
	private String dName;
	
	// Private constructor to initialize dName
	private Day(String dName) {
		super();
		this.dName = dName;
	}

	@Override
	public final String day(String dName) {
		
	    if (dName == null || !(dName.equals("sunday") ||
                dName.equals("monday") ||
                dName.equals("tuesday") ||
                dName.equals("wednesday") ||
                dName.equals("thursday") ||
                dName.equals("friday") ||
                dName.equals("saturday"))){
			
			throw new IllegalArgumentException("Day name cannot be null or Invalid name");
		}
			
		return this.dName;
	}
}
