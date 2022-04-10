package models;

import java.util.Arrays;
import java.util.List;

public class PlanetSystem implements Comparable<PlanetSystem> {

    private String name;

    private Star centerStar;

    private List<Planet> planets;

    public PlanetSystem(String name, Star centerStar, List<Planet> planets) {
        this.name = name;
        this.centerStar = centerStar;
        this.planets = planets;
    }

    public PlanetSystem(String name, Star centerStar, Planet... planets) {
        this.name = name;
        this.centerStar = centerStar;
        this.planets = Arrays.asList(planets);
    }

    public PlanetSystem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Star getCenterStar() {
        return centerStar;
    }

    public void setCenterStar(Star centerStar) {
        this.centerStar = centerStar;
    }

    public List<Planet> getPlanets() {
        return planets;
    }

    public void setPlanets(List<Planet> planets) {
        this.planets = planets;
    }

    /* Oppgave 2.2 */
    public Planet getPlanet(String name) {
        for(Planet planet : this.planets) {
            if(name.equalsIgnoreCase(planet.getName())) {
                return planet;
            }
        }
        return new Planet();
    }

    public Planet getBiggestPlanet() {
        Planet biggestPlanet = null;
        for(Planet planet : this.planets) {
            if(biggestPlanet == null) biggestPlanet = planet;

            if(planet.getRadius() > biggestPlanet.getRadius()) {
                biggestPlanet = planet;
            }
            else if(planet.getRadius() == biggestPlanet.getRadius()) {
                if(planet.getMass() > biggestPlanet.getMass()) {
                    biggestPlanet = planet;
                }
            }
        }
        return biggestPlanet;
    }

    public Planet getSmallestPlanet() {
        Planet smallestPlanet = null;
        for(Planet planet : this.planets) {
            if(smallestPlanet == null) smallestPlanet = planet;

            if(planet.getRadius() < smallestPlanet.getRadius()) {
                smallestPlanet = planet;
            }
            else if(planet.getRadius() == smallestPlanet.getRadius()) {
                if(planet.getMass() < smallestPlanet.getMass()) {
                    smallestPlanet = planet;
                }
            }
        }
        return smallestPlanet;
    }

    @Override
    public String toString() {
        String planetsString = "";
        for(Planet planet : planets) {
            planetsString += "\n    Name: " + planet.getName() + ", Radius: " + planet.getRadius() + ", Mass: " + planet.getMass();
        }

        String centerStarString = "\n    Name: " + centerStar.getName() + ", Radius: " + centerStar.getRadius() + ", Mass: " + centerStar.getMass() + ", Effective Temperature: " + centerStar.getEffectiveTemp();

        return "Name: " + this.name + "\nCenter star: " + centerStarString + "\nPlanets: " + planetsString;

    }

    public String toStringMetric() {
        String planetsString = "";
        for(Planet planet : planets) {
            planetsString += "\n    Name: " + planet.getName() + ", Radius (km): " + planet.getRadiusInKm() + ", Mass (kg): " + planet.getMassInKg();
        }

        String centerStarString = "\n    Name: " + centerStar.getName() + ", Radius (km): " + centerStar.getRadiusInKm() + ", Mass (kg): " + centerStar.getMassInKg() + ", Effective Temperature: " + centerStar.getEffectiveTemp();

        return "Name: " + this.name + "\nCenter star: " + centerStarString + "\nPlanets: " + planetsString;
    }


    @Override
    public int compareTo(PlanetSystem o) {
        return Integer.compare(o.planets.size(), this.planets.size());

        /*
        if(this.planets.size() == o.planets.size()) return 0;
        else if(this.planets.size() < o.planets.size()) return 1;
        else return -1;
         */
    }
}
