package oppgave_3_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Planet> planets = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("How many planets do you want to create? ");
        int amount = input.nextInt();

        for(int i = 1; i <= amount; i++) {
            Scanner planetInput = new Scanner(System.in);

            System.out.print("Enter the name of planet " + i + ": \n");
            String name = planetInput.nextLine();

            System.out.println("Enter the radius of planet " + i + " in km: ");
            double radius = planetInput.nextDouble();

            System.out.println("Enter the mass of planet " + i + " in kg: ");
            double mass = planetInput.nextDouble();

            Planet planet = new Planet(name, radius, mass);
            planets.add(planet);
        }

        String s = planets.size() >= 2 ? "s" : "";
        System.out.println("You have created " + planets.size() + " planet" + s + ". This is the information about them: ");
        for(Planet planet : planets) {
            System.out.println(planet);
        }

    }

}
