package com.indus.training.core.svc;

import com.indus.training.core.impl.Month;

import junit.framework.TestCase;

public class MonthTest extends TestCase {

	public void testMonth1() {
		// 1. Input
		String monthName = "January";
		int noOfDays = 31;
		// 2. Expected Result
		String expResult = "Month, No of days :  " + monthName + " " + noOfDays;

		// 3. Actual Result
		String actResult = "Month, No of days :  " + Month.JANUARY.month(monthName, noOfDays);
		System.out.println(actResult);
		// 4. Assertion
		assertEquals(expResult, actResult);
	}

	public void testMonth2() {
		// 1. Input
		String monthName = "February";
		int noOfDays = 28; // Adjust to 29 for leap years if needed
		// 2. Expected Result
		String expResult = "Month, No of days :  " + monthName + " " + noOfDays;

		// 3. Actual Result
		String actResult = "Month, No of days :  " + Month.FEBRUARY.month(monthName, noOfDays);
		System.out.println(actResult);
		// 4. Assertion
		assertEquals(expResult, actResult);
	}

	public void testMonth3() {
		// 1. Input
		String monthName = "March";
		int noOfDays = 31;
		// 2. Expected Result
		String expResult = "Month, No of days :  " + monthName + " " + noOfDays;

		// 3. Actual Result
		String actResult = "Month, No of days :  " + Month.MARCH.month(monthName, noOfDays);
		System.out.println(actResult);
		// 4. Assertion
		assertEquals(expResult, actResult);
	}

	public void testMonth4() {
		// 1. Input
		String monthName = "April";
		int noOfDays = 30;
		// 2. Expected Result
		String expResult = "Month, No of days :  " + monthName + " " + noOfDays;

		// 3. Actual Result
		String actResult = "Month, No of days :  " + Month.APRIL.month(monthName, noOfDays);
		System.out.println(actResult);
		// 4. Assertion
		assertEquals(expResult, actResult);
	}

	public void testMonth5() {
		// 1. Input
		String monthName = "May";
		int noOfDays = 31;
		// 2. Expected Result
		String expResult = "Month, No of days :  " + monthName + " " + noOfDays;

		// 3. Actual Result
		String actResult = "Month, No of days :  " + Month.MAY.month(monthName, noOfDays);
		System.out.println(actResult);
		// 4. Assertion
		assertEquals(expResult, actResult);
	}

	public void testMonth6() {
		// 1. Input
		String monthName = "June";
		int noOfDays = 30;
		// 2. Expected Result
		String expResult = "Month, No of days :  " + monthName + " " + noOfDays;

		// 3. Actual Result
		String actResult = "Month, No of days :  " + Month.JUNE.month(monthName, noOfDays);
		System.out.println(actResult);
		// 4. Assertion
		assertEquals(expResult, actResult);
	}

	public void testMonth7() {
		// 1. Input
		String monthName = "July";
		int noOfDays = 31;
		// 2. Expected Result
		String expResult = "Month, No of days :  " + monthName + " " + noOfDays;

		// 3. Actual Result
		String actResult = "Month, No of days :  " + Month.JULY.month(monthName, noOfDays);
		System.out.println(actResult);
		// 4. Assertion
		assertEquals(expResult, actResult);
	}

	public void testMonth8() {
		// 1. Input
		String monthName = "August";
		int noOfDays = 31;
		// 2. Expected Result
		String expResult = "Month, No of days :  " + monthName + " " + noOfDays;

		// 3. Actual Result
		String actResult = "Month, No of days :  " + Month.AUGUST.month(monthName, noOfDays);
		System.out.println(actResult);
		// 4. Assertion
		assertEquals(expResult, actResult);
	}

	public void testMonth9() {
		// 1. Input
		String monthName = "September";
		int noOfDays = 30;
		// 2. Expected Result
		String expResult = "Month, No of days :  " + monthName + " " + noOfDays;

		// 3. Actual Result
		String actResult = "Month, No of days :  " + Month.SEPTEMBER.month(monthName, noOfDays);
		System.out.println(actResult);
		// 4. Assertion
		assertEquals(expResult, actResult);
	}

	public void testMonth10() {
		// 1. Input
		String monthName = "October";
		int noOfDays = 31;
		// 2. Expected Result
		String expResult = "Month, No of days :  " + monthName + " " + noOfDays;

		// 3. Actual Result
		String actResult = "Month, No of days :  " + Month.OCTOBER.month(monthName, noOfDays);
		System.out.println(actResult);
		// 4. Assertion
		assertEquals(expResult, actResult);
	}

	public void testMonth11() {
		// 1. Input
		String monthName = "November";
		int noOfDays = 30;
		// 2. Expected Result
		String expResult = "Month, No of days :  " + monthName + " " + noOfDays;

		// 3. Actual Result
		String actResult = "Month, No of days :  " + Month.NOVEMBER.month(monthName, noOfDays);
		System.out.println(actResult);
		// 4. Assertion
		assertEquals(expResult, actResult);
	}

	public void testMonth12() {
		// 1. Input
		String monthName = "December";
		int noOfDays = 31;
		// 2. Expected Result
		String expResult = "Month, No of days :  " + monthName + " " + noOfDays;

		// 3. Actual Result
		String actResult = "Month, No of days :  " + Month.DECEMBER.month(monthName, noOfDays);
		System.out.println(actResult);
		// 4. Assertion
		assertEquals(expResult, actResult);
	}

}
