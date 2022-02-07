package models;

public class Planet {

    private String name;

    private double radius;

    private double mass;

    public Planet(String name, double radius, double mass) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
    }

    public Planet() {

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

    public double getRadiusInKm() {
        return radius*71492;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public double getMassInKg() {
        return mass*1.898E27;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getSurfaceGravity() {
        return (6.67408E-11*getMassInKg())/(getRadiusInKm()*1000*getRadiusInKm()*1000);
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\nRadius: " + this.radius + "\nMass: " + this.mass;
    }

    public String toStringStandardUnits() {
        return "Name: " + this.name + "\nRadius (km): " + this.getRadiusInKm() + "\nMass (kg): " + this.getMassInKg();
    }
}
