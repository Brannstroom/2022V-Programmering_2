package models;

import java.util.List;

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

    @Override
    public int compareTo(CelestialBody o) {
        return Double.compare(o.mass, this.mass);

        /*
        if(this.mass == o.mass) return 0;
        else if(this.mass < o.mass) return 1;
        else return -1;
        */
    }
}
