package CardsWithPower;

public class CardPower {
    private CardSuit cardSuit;
    private CardRank cardRank;
    private int power;

    public CardPower (CardSuit cardSuit, CardRank cardRank){
        this.cardSuit = cardSuit;
        this.cardRank = cardRank;
    }

    public int getPower(){
        return this.cardSuit.getSuit() + this.cardRank.powerRank();
    }
}
