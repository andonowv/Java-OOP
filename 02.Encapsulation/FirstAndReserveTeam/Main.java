package FirstAndReserveTeam;

import SortByName.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        Team team = new Team("Black Eagles");
        for (int i = 0; i < count; i++) {
            String [] tokens = scanner.nextLine().split("\\s+");
            String firstName = tokens [0];
            String lastName = tokens [1];
            int age = Integer.parseInt(tokens[2]);
            double salary = Double.parseDouble(tokens[3]);

            Person player = new Person(firstName, lastName, age);

            team.add(player);
        }
        System.out.printf("First team have %d players\n", team.getFirstTeam().size());
        System.out.printf("Reserve team have %d players", team.getSecondTeam().size());
    }
}
