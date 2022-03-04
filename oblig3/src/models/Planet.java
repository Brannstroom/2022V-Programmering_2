package models;

public class Planet extends NaturalSatellite {


    public Planet() {
    }

    public Planet(String name, double radius, double mass) {
        super(name, radius, mass);
    }

    public Planet(String name, double radius, double mass, double semiMajorAxis, double eccentricity, double orbitalPeriod) {
        super(name, radius, mass, semiMajorAxis, eccentricity, orbitalPeriod);
    }

    public Planet(String name, double radius, double mass, double semiMajorAxis, double eccentricity, double orbitalPeriod, CelestialBody centralCelestialBody) {
        super(name, radius, mass, semiMajorAxis, eccentricity, orbitalPeriod, centralCelestialBody);
    }


    @Override
    public double getRadiusInKm() {
        return mass*RJUP;
    }

    @Override
    public double getMassInKg() {
        return mass*MJUP;
    }
}
