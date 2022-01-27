package oppgave_3_1;

/*
Ettersom vi også bruker klassenavnet Planet i oppgave 2.3, bruker vi ikke public modifikatoren.
Dette gjør jeg fordi jeg ikke vil bruke samme klasse som i oppgave 2.3, slik at vi kan gjøre endringer her
separat fra tidligere oppgaver.
 */
class Planet {

    private String name;

    private double radius;

    private double mass;

    public Planet(String name, double radius, double mass) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
    }

    // En tom konstruktør slik at vi kan initialiserer Planet uten å gi den noen verdier.
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

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    @Override
    public String toString() {
        return "Planeten " + this.name + " har en radius på "+ this.radius + " km og en masse på " + this.mass + " kg";
    }
}