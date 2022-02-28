package models;

public abstract class NaturalSatellite extends CelestialBody {

    private double semiMajorAxis;

    private double eccentricity;

    private double orbitalPeriod;

    private CelestialBody centralCelestialBody;


    public NaturalSatellite() {
    }

    public NaturalSatellite(String name, double radius, double mass) {
        super(name, radius, mass);
    }

    public NaturalSatellite(String name, double radius, double mass, double semiMajorAxis, double eccentricity, double orbitalPeriod) {
        super(name, radius, mass);

        this.semiMajorAxis = semiMajorAxis;
        this.eccentricity = eccentricity;
        this.orbitalPeriod = orbitalPeriod;
    }

    public NaturalSatellite(String name, double radius, double mass, double semiMajorAxis, double eccentricity, double orbitalPeriod, CelestialBody centralCelestialBody) {
        super(name, radius, mass);

        this.semiMajorAxis = semiMajorAxis;
        this.eccentricity = eccentricity;
        this.orbitalPeriod = orbitalPeriod;
        this.centralCelestialBody = centralCelestialBody;
    }

    public double getSemiMajorAxis() {
        return semiMajorAxis;
    }

    public void setSemiMajorAxis(double semiMajorAxis) {
        this.semiMajorAxis = semiMajorAxis;
    }

    public double getEccentricity() {
        return eccentricity;
    }

    public void setEccentricity(double eccentricity) {
        this.eccentricity = eccentricity;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public void setOrbitalPeriod(double orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
    }

    public CelestialBody getCentralCelestialBody() {
        return centralCelestialBody;
    }

    public void setCentralCelestialBody(CelestialBody centralCelestialBody) {
        this.centralCelestialBody = centralCelestialBody;
    }

    /* Oppgave 2.5 a */
    public double distanceToCentralBody(double degrees) {
        double a = this.semiMajorAxis;
        double e = this.eccentricity;
        double t = Math.toRadians(degrees);
        return (a*(1-Math.pow(e, 2)))/(1+e*Math.cos(t))*149597871;
    }

    /* Oppgave 2.6 a */
    /**
     *
     * @param distance distance to central body
     * @param inMeters returns the value in meters, else in km
     * @return
     */
    public double orbitingVelocity(double distance, boolean inMeters) {
        double g = 6.67408E-11;
        double m = centralCelestialBody.getMassInKg();
        double r = distance*1000;

        int i = inMeters ? 1 : 1000;
        return Math.sqrt((g*m)/r)/i;
    }
}
