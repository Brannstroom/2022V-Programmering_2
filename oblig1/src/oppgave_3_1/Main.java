package oppgave_3_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Planet planet = new Planet();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of the planet: \n");
        planet.setName(input.nextLine());

        System.out.println("Enter the radius of the planet in km: ");
        planet.setRadius(input.nextDouble());

        System.out.println("Enter the mass of the planet in kg: ");
        planet.setMass(input.nextDouble());

        System.out.println(planet);


    }
}
