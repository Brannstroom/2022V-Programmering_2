package models;

public abstract class CelestialBody {

    private String name;

    private double radius;

    private double mass;

    public CelestialBody(String name, double radius, double mass) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
    }

    public CelestialBody() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }

    public double getRadiusInKm(CelestialBodyType celestialBodyType) {
        switch (celestialBodyType) {
            case PLANET:
                return radius*71492;

            case STAR:
                return radius*695700;
        }
        return 0.0;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public double getMassInKg(CelestialBodyType celestialBodyType) {
        switch (celestialBodyType) {
            case PLANET:
                return mass*1.898E27;

            case STAR:
                return mass*1.98892E30;
        }
        return 0.0;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getSurfaceGravity(CelestialBodyType celestialBodyType) {
        return (6.67408E-11*this.getMassInKg(celestialBodyType))/(this.getRadiusInKm(celestialBodyType)*1000*this.getRadiusInKm(celestialBodyType)*1000);
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\nRadius: " + this.radius + "\nMass: " + this.mass;
    }

    public String toString(CelestialBodyType celestialBodyType) {
        return "Name: " + this.name + "\nRadius (km): " + this.getRadiusInKm(celestialBodyType) + "\nMass (kg): " + this.getMassInKg(celestialBodyType);
    }

}
