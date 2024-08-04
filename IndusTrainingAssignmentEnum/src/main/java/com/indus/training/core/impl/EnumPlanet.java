package com.indus.training.core.impl;

public enum EnumPlanet {
    MERCURY("Mercury", "Grey", 4879.4, 0),
    VENUS("Venus", "Yellow", 12104, 0),
    EARTH("Earth", "Blue", 12742, 1),
    MARS("Mars", "Red", 6779, 2),
    JUPITER("Jupiter", "Brown", 139820, 79),
    SATURN("Saturn", "Pale Yellow", 116460, 83),
    URANUS("Uranus", "Blue", 50724, 27),
    NEPTUNE("Neptune", "Blue", 49244, 14);

    private final String planetName;
    private final String planetColor;
    private final double planetDiameter;
    private final int planetMoons;

    // Static field for planet count
    private static final int PLANET_COUNT;

    // Static initializer
    static {
        PLANET_COUNT = EnumPlanet.values().length;
    }

    // Private constructor
    EnumPlanet(String planetName, String planetColor, double planetDiameter, int planetMoons) {
        this.planetName = planetName;
        this.planetColor = planetColor;
        this.planetDiameter = planetDiameter;
        this.planetMoons = planetMoons;
    }

    // Instance method
    public String getPlanetName() {
        return planetName;
    }

    public String getPlanetColor() {
        return planetColor;
    }

    public double getPlanetDiameter() {
        return planetDiameter;
    }

    public int getPlanetMoons() {
        return planetMoons;
    }

    public String getPlanetDetails() {
        return String.format("The Planet Details are: " + this.planetName + " ,"  + this.planetColor + " ," + this.planetDiameter + " ," + this.planetMoons);
    }

    // Static method
    public static int getPlanetCount() {
        return PLANET_COUNT;
    }

//    public static void main(String[] args) {
//        // Accessing the implicit values() method
//        EnumPlanet[] planets = EnumPlanet.values();
//        for (EnumPlanet planet : planets) {
//            System.out.println(planet.getPlanetDetails());
//        }
//
//        // Accessing the implicit valueOf() method
//        EnumPlanet mars = EnumPlanet.valueOf("MARS");
//        System.out.println("Planet: " + mars.getPlanetName());
//
//        // Accessing the implicit ordinal() method
//        System.out.println("Mars ordinal: " + mars.ordinal());
//
//        // Accessing the implicit name() method
//        System.out.println("Mars name: " + mars.name());
//
//        // Accessing the static method
//        System.out.println("Total number of planets: " + EnumPlanet.getPlanetCount());
//    }
}

