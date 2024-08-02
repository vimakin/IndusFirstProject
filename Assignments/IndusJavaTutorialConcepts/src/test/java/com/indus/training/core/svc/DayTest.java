package com.indus.training.core.svc;

import com.indus.training.core.impl.Day;

import junit.framework.TestCase;

public class DayTest extends TestCase {

	public void testGetDayName1() {

		// 1. Input
		String dayName = "sunday";
		// 2. Expected Result
		String expResult = "Sunday";
		// 3. Actual Result
		String actResult = Day.SUNDAY.day(dayName);
		// 4. Assertion
		assertEquals(expResult, actResult);

	}

	public void testGetDayName2() {

		// 1. Input
		String dayName = "monday";
		// 2. Expected Result
		String expResult = "Monday";
		// 3. Actual Result
		String actResult = Day.MONDAY.day(dayName);
		// 4. Assertion
		assertEquals(expResult, actResult);

	}

	public void testGetDayName3() {

		// 1. Input
		String dayName = "tuesday";
		// 2. Expected Result
		String expResult = "Tuesday";
		// 3. Actual Result
		String actResult = Day.TUESDAY.day(dayName);
		// 4. Assertion
		assertEquals(expResult, actResult);

	}

	public void testGetDayName4() {

		// 1. Input
		String dayName = "wednesday";
		// 2. Expected Result
		String expResult = "Wednesday";
		// 3. Actual Result
		String actResult = Day.WEDNESDAY.day(dayName);
		// 4. Assertion
		assertEquals(expResult, actResult);

	}

	public void testGetDayName5() {

		// 1. Input
		String dayName = "thursday";
		// 2. Expected Result
		String expResult = "Thursday";
		// 3. Actual Result
		String actResult = Day.THURSDAY.day(dayName);
		// 4. Assertion
		assertEquals(expResult, actResult);

	}

	public void testGetDayName6() {

		// 1. Input
		String dayName = "friday";
		// 2. Expected Result
		String expResult = "Friday";
		// 3. Actual Result
		String actResult = Day.FRIDAY.day(dayName);
		// 4. Assertion
		assertEquals(expResult, actResult);

	}

	public void testGetDayName7() {

		// 1. Input
		String dayName = "saturday";
		// 2. Expected Result
		String expResult = "Saturday";
		// 3. Actual Result
		String actResult = Day.SATURDAY.day(dayName);
		// 4. Assertion
		assertEquals(expResult, actResult);

	}

}
