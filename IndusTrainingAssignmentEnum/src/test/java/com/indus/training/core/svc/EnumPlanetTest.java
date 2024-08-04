package com.indus.training.core.svc;

import com.indus.training.core.impl.EnumPlanet;

import junit.framework.TestCase;

public class EnumPlanetTest extends TestCase {

	public final void testGetPlanetName() {
		
		// 1. Input
		String planetName = "Mercury";
		// 2. Expected Result
		String expResult = ("Planet Name: " + planetName);
		// 3. Actual Result
		String result = EnumPlanet.MERCURY.getPlanetName();
		String actResult = ("Planet Name: " + result);
		// 4. Assertion
		assertEquals(expResult, actResult);
			
	}

	public final void testPlanetDetails() {
		
		// 1. Input
		String planetName = "Mercury";
		String planetColor = "Grey";
		double planetDiameter = 4879.4;
		int planetMoons = 0;
		// 2. Expected Result
		String expResult = ("The Planet Details are: " + planetName + " ," + planetColor + " ," + planetDiameter + " ,"  + planetMoons);
		System.out.println(expResult);
		// 3. Actual Result
		String actResult = EnumPlanet.MERCURY.getPlanetDetails();
		System.out.println(actResult);
;		// 4. Assertion
		assertEquals(expResult, actResult);
		
	}

}
