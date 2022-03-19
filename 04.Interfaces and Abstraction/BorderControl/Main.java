package BorderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Robot> robots = new ArrayList<>();
        List <Citizen> citizens = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("End")){
            String [] tokens = input.split("\\s+");
            if (tokens.length == 2){
                Robot r = new Robot(tokens [0], tokens [1]);
                robots.add(r);
            }else if (tokens.length == 3){
                Citizen c = new Citizen(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
                citizens.add(c);
            }

            input = scanner.nextLine();
        }
        String endId = scanner.nextLine();

        for (Citizen citizen : citizens) {
            if (citizen.getId().endsWith(endId)){
                System.out.println(citizen.getId());
            }
        }
        for (Robot robot : robots) {
            if (robot.getId().endsWith(endId)){
                System.out.println(robot.getId());
            }
        }
    }
}
