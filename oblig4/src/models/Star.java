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

    @Override
    public int compareTo(CelestialBody o) {
        return Double.compare(this.mass, o.mass);

        /*
        if (this.mass == o.mass) return 0;
        else if (this.mass > o.mass) return 1;
        else return -1;
         */
    }

    public String serialize() {
        return this.name + "," + this.radius + "," + this.mass + "," + this.effectiveTemp;
    };

    public static Star deserialize(String string) {
        String[] strings = string.split(",");
        return new Star(strings[0], Double.valueOf(strings[1]), Double.valueOf(strings[2]), Double.valueOf(strings[3]));
    }
}
