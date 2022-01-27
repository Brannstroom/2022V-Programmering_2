package oppgave_3_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlanetHandler {

    static List<Planet> planets = new ArrayList<>();

    void helpMenu() {
        System.out.println("Planet database");
        System.out.println("Commands: ");
        System.out.println("    'help' - Brings up this list of commands");
        System.out.println("    'new' - Creates a new planet");
        System.out.println("    'list' - List all created planets");
        System.out.println("    'edit <planet>' - Edits the specified planet");
        System.out.println("    'remove <planet>' - Removes specified planet");
        System.out.println("    'exit' - Exits the program");
    }

    void newPlanet() {
        Planet planet = new Planet();
        Scanner planetInput = new Scanner(System.in);


        /* Ettersom en string kan være tom kjører vi en while sjekk for å passe på at brukeren ikke legger til en planet uten navn. */
        String name = "";
        while(name == "") {
            System.out.print("Enter the name of your planet: \n");
            name = planetInput.nextLine();
        }
        planet.setName(name);

        System.out.println("Enter the radius of the planet in km: ");
        double radius = planetInput.nextDouble();
        planet.setRadius(radius);

        System.out.println("Enter the mass of the planet in kg: ");
        double mass = planetInput.nextDouble();
        planet.setMass(mass);

        planets.add(planet);
    }

    void listPlanets() {
        if(planets.size() > 0) {
            String s = planets.size() >= 2 ? "s" : "";
            System.out.println("You have created " + planets.size() + " planet" + s + ". This is the information about them: ");
            for (Planet planet : planets) {
                System.out.println(planet);
            }
        }
        else {
            System.out.println("You have not created any planets. Create one using the command 'new'");
        }

        System.out.println("\n");
    }

    Planet getPlanet(String name) {
        for (Planet planet : planets) {
            if (planet.getName().equalsIgnoreCase(name)) return planet;
        }
        return null;
    }

    void removePlanet(String input) {
        String[] args = input.split(" ");
        Planet planet = getPlanet(args[1]);

        if(planet != null) {
            planets.remove(planet);
            System.out.println("Removed planet " + planet.getName() + "\n");
        }
        else {
            System.out.println("Could not find planet '" + args[1] + "'. Check all your planets using the command 'list'. \n");
        }
    }

    void editPlanet(String input) {
        String[] args = input.split(" ");
        Planet planet = getPlanet(args[1]);

        if(planet != null) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a new name for the planet: (Previous: " + planet.getName() + ") ");
            String name = scanner.nextLine();
            planet.setName(name);

            System.out.println("Enter a new radius for the planet in km: (Previous: " + planet.getRadius() + ") ");
            double radius = scanner.nextDouble();
            planet.setRadius(radius);

            System.out.println("Enter the mass of the planet in kg: (Previous: " + planet.getMass() + ") ");
            double mass = scanner.nextDouble();
            planet.setMass(mass);

            System.out.println("Values for the planet has been updated. \n");
        }
        else {
            System.out.println("Could not find planet '" + args[1] + "'. Check all your planets using the command 'list'. \n");
        }
    }

    void exit() {
        System.out.println("Closing program.");
        System.exit(0);
    }

}
