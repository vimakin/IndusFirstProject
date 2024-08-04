package com.indus.training.core.impl;

import com.indus.training.core.svc.IEnumPlanetDescription;

public enum EnumPlanetDescription implements IEnumPlanetDescription {
	
	MERCURY("Mercury", "Closest to the Sun"), 
	VENUS("Venus", "Hottest planet"), 
	EARTH("Earth", "Home planet"),
	MARS("Mars", "Red planet");
	
	private String planetName;
	private String planetDescription;
	
	
	EnumPlanetDescription (String planetName, String planetDescription) {
		this.planetName = planetName;
		this.planetDescription = planetDescription;
	}
	
	
	public String getPlanetDescription() {
		
		return String.format("The Planet " + this.planetName + ": " + this.planetDescription);

	}

}
