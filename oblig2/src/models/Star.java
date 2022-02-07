package models;

public class Star {

    private String name;

    private double radius;

    private double mass;

    private double effectiveTemp;

    public Star(String name, double radius, double mass, double effectiveTemp) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
        this.effectiveTemp = effectiveTemp;
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
        return radius*695700;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public double getMassInKg() {
        return mass*1.98892E30;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getEffectiveTemp() {
        return effectiveTemp;
    }

    public void setEffectiveTemp(double effectiveTemp) {
        this.effectiveTemp = effectiveTemp;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\nRadius: " + this.radius + "\nMass: " + this.mass + "\nEffective temperature: " + this.effectiveTemp;
    }

    public String toStringStandardUnits() {
        return "Name: " + this.name + "\nRadius (km): " + this.getRadiusInKm() + "\nMass (kg): " + this.getMassInKg() + "\nEffetive temperature: " + this.effectiveTemp;
    }
}
