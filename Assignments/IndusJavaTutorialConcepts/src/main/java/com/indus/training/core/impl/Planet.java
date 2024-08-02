package com.indus.training.core.impl;

import com.indus.training.core.svc.APlanet;

public final class Planet extends APlanet {
    
    public static final Planet MERCURY = new Planet("Mercury", "Grey", 4879.4, 0);
    public static final Planet VENUS = new Planet("Venus", "Yellow", 12104, 0);
    public static final Planet EARTH = new Planet("Earth", "Blue", 12742, 1);
    public static final Planet MARS = new Planet("Mars", "Red", 6779, 2);
    public static final Planet JUPITER = new Planet("Jupiter", "Brown", 139820, 79);
    public static final Planet SATURN = new Planet("Saturn", "Pale Yellow", 116460, 83);
    public static final Planet URANUS = new Planet("Uranus", "Blue", 50724, 27);
    public static final Planet NEPTUNE = new Planet("Neptune", "Blue", 49244, 14);
    
    private String planetName;
    private String planetColor;
    private double planetDiameter;
    private int planetMoons;

    private Planet(String planetName, String planetColor, double planetDiameter, int planetMoons) {
        super();
        this.planetName = planetName;
        this.planetColor = planetColor;
        this.planetDiameter = planetDiameter;
        this.planetMoons = planetMoons;
    }

    public String planet(String planetName, String planetColor, double planetDiameter, int planetMoons) {
    	
        if (planetName == null || planetColor == null || planetDiameter <= 0 || planetMoons < 0) {
        	
            throw new IllegalArgumentException("Planet attributes cannot be Null or Invalid");
        }
        
       
        		String result = ("The Planet Details are: " + this.planetName + " ,"  + this.planetColor + " ," + this.planetDiameter + " ," + this.planetMoons);
        		
        		return result;
    }
}
