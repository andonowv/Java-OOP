package MultipleImplementation;

import java.lang.reflect.Method;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map <String, Buyer> buyerMap = new LinkedHashMap<>();

        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < count; i++) {
            String [] tokens = scanner.nextLine().split("\\s+");
            if (tokens.length == 4){
                Buyer buyer = new Citizen(tokens[0], Integer.parseInt(tokens[1]), tokens[2], tokens[3]);
                buyerMap.put(buyer.getName(), buyer);
            }else if (tokens.length == 3){
                Buyer buyer = new Rebel(tokens[0], Integer.parseInt(tokens[1]), tokens [2]);
                buyerMap.put(buyer.getName(), buyer);
            }
        }

        String line = scanner.nextLine();

        while (!line.equals("End")){
            Buyer buyer = buyerMap.get(line);

            if (buyer != null){
                buyer.buyFood();
            }

            line = scanner.nextLine();
        }
        System.out.println(buyerMap.values().stream().mapToInt(Buyer::getFood).sum());

    }
}
