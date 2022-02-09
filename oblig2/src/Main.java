import models.CelestialBodyType;
import models.Planet;
import models.PlanetSystem;
import models.Star;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("Oppgave 2.3");
        PlanetSystem solarSystem = new PlanetSystem("Milkyway",
                new Star("Sun", 1.0, 1.0, 5777),
                new Planet("Mercury", 0.03412549655905556, 1.7297154899894627E-4),
                new Planet("Venus", 0.08465003077267387, 0.002564278187565859),
                new Planet("Earth", 0.03412549655905556, 0.003146469968387777),
                new Planet("Mars", 0.04741089912158004, 3.3667017913593256E-4),
                new Planet("Jupiter", 1.0, 1.0),
                new Planet("Saturn", 0.3145247020645666, 0.2994204425711275),
                new Planet("Uranus", 0.3145247020645666, 0.04573761854583773),
                new Planet("Neptune", 0.34440217087226543, 0.05395152792413066)
        );
        System.out.println(solarSystem);

        System.out.println("\n\nOppgave 2.4");
        System.out.println(solarSystem.getPlanet("Saturn"));
        System.out.println(solarSystem.getCenterStar());

        System.out.println("\n\nOppgave 2.5");
        System.out.println(solarSystem.getPlanet("Neptune").getSurfaceGravity(CelestialBodyType.PLANET));

        System.out.println("\n\nOppgave 2.6");
        System.out.println("Biggest planet: \n" + solarSystem.getBiggestPlanet());
        System.out.println("\nSmallest planet: \n" + solarSystem.getSmallestPlanet());
    }
}
