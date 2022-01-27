package oppgave_3_3;

import java.util.Scanner;

public class Main {

    static PlanetHandler ph = new PlanetHandler();

    public static void main(String[] args) {

        ph.helpMenu();
        newInput();

    }

    private static void newInput() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a command: ");
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("help")) {
            ph.helpMenu();
        }
        else if (input.equalsIgnoreCase("new")) {
            ph.newPlanet();
        }
        else if (input.equalsIgnoreCase("list")) {
            ph.listPlanets();
        }
        else if (input.startsWith("edit")) {
            ph.editPlanet(input);
        }
        else if (input.startsWith("remove")) {
            ph.removePlanet(input);
        }
        else if (input.equalsIgnoreCase("exit")) {
            ph.exit();
        }
        else {
            System.out.println("Command is not valid, use 'help' to see a list of commands.\n");
        }

        newInput();
    }



}
