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

    @Override
    public String toString() {
        return super.toString() + "\nEffective temperature: " + this.effectiveTemp;
    }

    public String toString(CelestialBodyType celestialBodyType) {
        return super.toString(celestialBodyType) + "\nEffetive temperature: " + this.effectiveTemp;
    }
}
