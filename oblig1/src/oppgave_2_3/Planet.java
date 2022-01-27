package oppgave_2_3;


/*
Vi bruker ingen tilgangs modifikator, slik at den er begrenset til denne packegen, altså oppgave 2.3.
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
