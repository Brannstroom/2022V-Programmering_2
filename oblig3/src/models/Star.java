package models;

public class Star extends CelestialBody {

    private double effectiveTemp;

    public Star(String name, double radius, double mass, double effectiveTemp) {
        super(name, radius, mass);
        this.effectiveTemp = effectiveTemp;
    }

    public double getEffectiveTemp() {
        return effectiveTemp;
    }

    public void setEffectiveTemp(double effectiveTemp) {
        this.effectiveTemp = effectiveTemp;
    }

    public double getRadiusInKm() {
        return radius*RSUN;
    }

    public double getMassInKg() {
        return mass*MSUN;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEffective temperature: " + this.effectiveTemp;
    }

    @Override
    public String toStringMetric() {
        return super.toStringMetric() + "\nEffective temperature: " + this.effectiveTemp;
    }
}
