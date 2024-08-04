package com.indus.training.core.svc;

import com.indus.training.core.impl.EnumPlanetDescription;

import junit.framework.TestCase;

public class EnumPlanetDescriptionTest extends TestCase {

	public void testGetPlanetDescription() {
		
		// 1. Input
		String planetName = "Mercury";
		String planetDescription = "Closest to the Sun";
		// 2. Expected Result
		String expResult = ("The Planet " + planetName + ": " + planetDescription);
		System.out.println(expResult);
		// 3. Actual Result
		String actResult = EnumPlanetDescription.MERCURY.getPlanetDescription();
		System.out.println(actResult);
		// 4. Assertion
		assertEquals(expResult, actResult);
	}

}
