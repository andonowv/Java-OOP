package test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Animal goat = new Goat();
        Animal cow = new Cow();
        List <Animal> animals = new ArrayList<>();
        animals.add(new Cow());
        animals.add(new Goat());

        for (Animal animal : animals) {
            animal.printEat();
        }
    }
}
