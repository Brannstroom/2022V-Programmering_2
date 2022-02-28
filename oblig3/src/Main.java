import models.Planet;
import models.PlanetSystem;
import models.Star;

public class Main {

    public static void main(String[] args) {

        Star star = new Star("Sun", 1.0, 1.0, 5777);

        PlanetSystem solarSystem = new PlanetSystem(
                "Milkyway",
                star,
                new Planet("Mercury", 0.03412549655905556, 1.7297154899894627E-4,  0.387, 0.206, 88, star),
                new Planet("Venus", 0.08465003077267387, 0.002564278187565859, 0.723, 0.007, 225, star),
                new Planet("Earth", 0.03412549655905556, 0.003146469968387777, 1, 0.017, 365, star),
                new Planet("Mars", 0.04741089912158004, 3.3667017913593256E-4, 1.524, 0.093, 687, star),
                new Planet("Jupiter", 1.0, 1.0, 5.20440, 0.049, 4380, star),
                new Planet("Saturn", 0.3145247020645666, 0.2994204425711275, 9.5826, 0.057, 10585, star),
                new Planet("Uranus", 0.3145247020645666, 0.04573761854583773, 19.2184, 0.046, 30660, star),
                new Planet("Neptune", 0.34440217087226543, 0.05395152792413066, 30.11, 0.010, 60225, star)
        );

        Planet earth = solarSystem.getPlanet("Earth");

        /* Oppgave 2.5 b */
        int [] degrees2_5 = {0, 90, 180, 270, 360};
        for(int i : degrees2_5) {
            System.out.println(earth.getName() + " has a distance of " + earth.distanceToCentralBody(i) + " to the " + earth.getCentralCelestialBody().getName() + " at " + i + " degrees");
        }

        /* Oppgave 2.6 b */
        int[] degrees2_6 = {0, 45, 90, 135, 180};
        for(int i : degrees2_6) {
            double distance = earth.distanceToCentralBody(i);
            System.out.println("At a distance of " + distance + "km, " + earth.getName() + " has a velocity of " + earth.orbitingVelocity(distance, false) + "km/s");
        }
    }
}
