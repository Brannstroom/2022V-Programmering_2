package models;

public abstract class CelestialBody {

    protected String name;

    protected double radius;

    protected double mass;

    /* Task 2.3 */
    protected static final double RJUP = 71492;
    protected static final double RSUN = 695700;

    protected static final double MJUP = 1.898E27;
    protected static final double MSUN = 1.98892E30;


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

    public abstract double getRadiusInKm();

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public abstract double getMassInKg();

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getSurfaceGravity() {
        return (6.67408E-11*this.getMassInKg())/(this.getRadiusInKm()*1000*this.getRadiusInKm()*1000);
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\nRadius: " + this.radius + "\nMass: " + this.mass;
    }

    public String toStringMetric() {
        return "Name: " + this.name + "\nRadius (km): " + this.getRadiusInKm() + "\nMass (kg): " + this.getMassInKg();
    }

}
