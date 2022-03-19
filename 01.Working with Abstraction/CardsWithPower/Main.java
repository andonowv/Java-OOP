package CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rankCard = scanner.nextLine();
        String suitCard = scanner.nextLine();

        CardPower cardPower = new CardPower(CardSuit.valueOf(suitCard), CardRank.valueOf(rankCard));

        System.out.printf("Card name: %s of %s; Card power: %d", rankCard, suitCard, cardPower.getPower());
    }
}
