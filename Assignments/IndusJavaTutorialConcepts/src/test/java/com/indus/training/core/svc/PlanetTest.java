package com.indus.training.core.svc;

import com.indus.training.core.impl.Planet;

import junit.framework.TestCase;

public class PlanetTest extends TestCase {

	public void testPlanetMercury() {
		
		// 1. Input
		String planetName = "Mercury";
		String planetColor = "Grey";
		double planetDiameter = 4879.4;
		int planetMoons = 0;
		// 2. Expected Result
		String expResult = ("The Planet Details are: " + planetName + " ," + planetColor + " ," + planetDiameter + " ,"  + planetMoons);
		// 3. Actual Result
		String actResult = Planet.MERCURY.planet(planetName, planetColor, planetDiameter, planetMoons);
		// 4. Assertion
		assertEquals(expResult, actResult);	
		
	}
	
	public void testPlanetVenus() {
	    // 1. Input
	    String planetName = "Venus";
	    String planetColor = "Yellow";
	    double planetDiameter = 12104;
	    int planetMoons = 0;
	    // 2. Expected Result
	    String expResult = ("The Planet Details are: " + planetName + " ," + planetColor + " ," + planetDiameter + " ," + planetMoons);
	    // 3. Actual Result
	    String actResult = Planet.VENUS.planet(planetName, planetColor, planetDiameter, planetMoons);
	    // 4. Assertion
	    assertEquals(expResult, actResult);
	}

	public void testPlanetEarth() {
	    // 1. Input
	    String planetName = "Earth";
	    String planetColor = "Blue";
	    double planetDiameter = 12742;
	    int planetMoons = 1;
	    // 2. Expected Result
	    String expResult = ("The Planet Details are: " + planetName + " ," + planetColor + " ," + planetDiameter + " ," + planetMoons);
	    // 3. Actual Result
	    String actResult = Planet.EARTH.planet(planetName, planetColor, planetDiameter, planetMoons);
	    // 4. Assertion
	    assertEquals(expResult, actResult);
	}

	public void testPlanetMars() {
	    // 1. Input
	    String planetName = "Mars";
	    String planetColor = "Red";
	    double planetDiameter = 6779;
	    int planetMoons = 2;
	    // 2. Expected Result
	    String expResult = ("The Planet Details are: " + planetName + " ," + planetColor + " ," + planetDiameter + " ," + planetMoons);
	    // 3. Actual Result
	    String actResult = Planet.MARS.planet(planetName, planetColor, planetDiameter, planetMoons);
	    // 4. Assertion
	    assertEquals(expResult, actResult);
	}

	public void testPlanetJupiter() {
	    // 1. Input
	    String planetName = "Jupiter";
	    String planetColor = "Brown";
	    double planetDiameter = 139820;
	    int planetMoons = 79;
	    // 2. Expected Result
	    String expResult = ("The Planet Details are: " + planetName + " ," + planetColor + " ," + planetDiameter + " ," + planetMoons);
	    // 3. Actual Result
	    String actResult = Planet.JUPITER.planet(planetName, planetColor, planetDiameter, planetMoons);
	    // 4. Assertion
	    assertEquals(expResult, actResult);
	}

	public void testPlanetSaturn() {
	    // 1. Input
	    String planetName = "Saturn";
	    String planetColor = "Pale Yellow";
	    double planetDiameter = 116460;
	    int planetMoons = 83;
	    // 2. Expected Result
	    String expResult = ("The Planet Details are: " + planetName + " ," + planetColor + " ," + planetDiameter + " ," + planetMoons);
	    // 3. Actual Result
	    String actResult = Planet.SATURN.planet(planetName, planetColor, planetDiameter, planetMoons);
	    // 4. Assertion
	    assertEquals(expResult, actResult);
	}

	public void testPlanetUranus() {
	    // 1. Input
	    String planetName = "Uranus";
	    String planetColor = "Blue";
	    double planetDiameter = 50724;
	    int planetMoons = 27;
	    // 2. Expected Result
	    String expResult = ("The Planet Details are: " + planetName + " ," + planetColor + " ," + planetDiameter + " ," + planetMoons);
	    // 3. Actual Result
	    String actResult = Planet.URANUS.planet(planetName, planetColor, planetDiameter, planetMoons);
	    // 4. Assertion
	    assertEquals(expResult, actResult);
	}

	public void testPlanetNeptune() {
	    // 1. Input
	    String planetName = "Neptune";
	    String planetColor = "Blue";
	    double planetDiameter = 49244;
	    int planetMoons = 14;
	    // 2. Expected Result
	    String expResult = ("The Planet Details are: " + planetName + " ," + planetColor + " ," + planetDiameter + " ," + planetMoons);
	    // 3. Actual Result
	    String actResult = Planet.NEPTUNE.planet(planetName, planetColor, planetDiameter, planetMoons);
	    // 4. Assertion
	    assertEquals(expResult, actResult);
	}

}
