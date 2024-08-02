package com.indus.training.core.impl;

import com.indus.training.core.svc.AMonth;

public final class Month extends AMonth {
		
	public static final Month JANUARY = new Month("January", 31);
	public static final Month FEBRUARY = new Month("February", 28);
	public static final Month MARCH = new Month("March", 31);
	public static final Month APRIL = new Month("April", 30);
	public static final Month MAY = new Month("May", 31);
	public static final Month JUNE = new Month("June", 30);
	public static final Month JULY = new Month("July", 31);
	public static final Month AUGUST = new Month("August", 31);
	public static final Month SEPTEMBER = new Month("September", 30);
	public static final Month OCTOBER = new Month("October", 31);
	public static final Month NOVEMBER = new Month("November", 30);
	public static final Month DECEMBER = new Month("December", 31);

	
	private String monthName;
	private int noOfDays;


	private Month(String monthName, int noOfDays) {
		super();
		this.monthName = monthName;
		this.noOfDays = noOfDays;
	}

	@Override
	public String month(String monthName, int noOfDays) {
		
        if (monthName == null || 
                !(monthName.equals("January") && noOfDays == 31 || 
                  monthName.equals("February") && noOfDays == 28 || 
                  monthName.equals("March") && noOfDays == 31 || 
                  monthName.equals("April") && noOfDays == 30 || 
                  monthName.equals("May") && noOfDays == 31 || 
                  monthName.equals("June") && noOfDays == 30 || 
                  monthName.equals("July") && noOfDays == 31 || 
                  monthName.equals("August") && noOfDays == 31 || 
                  monthName.equals("September") && noOfDays == 30 || 
                  monthName.equals("October") && noOfDays == 31 || 
                  monthName.equals("November") && noOfDays == 30 || 
                  monthName.equals("December") && noOfDays == 31)) {
        	
        	throw new IllegalArgumentException("Month and days cannot be null or Invalid");
        	
        }
        
        String result = (this.monthName + " " +  this.noOfDays);
        
        return result;
	}

}
