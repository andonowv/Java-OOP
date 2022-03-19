package SortByName;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        List <Person> personList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            String [] tokens = scanner.nextLine().split("\\s+");
            String firstName = tokens [0];
            String lastName = tokens [1];
            int age = Integer.parseInt(tokens [2]);
            Person particularPerson = new Person(firstName, lastName, age);
            personList.add(particularPerson);
        }
        Collections.sort(personList, (first, second) -> {
            int sComp = first.getFirstName().compareTo(second.getFirstName());

            if (sComp != 0){
                return sComp;
            }
            else {
                return Integer.compare(first.getAge(), second.getAge());
            }
        });
        for (Person person : personList) {
            System.out.println(person);
        }
    }
}
