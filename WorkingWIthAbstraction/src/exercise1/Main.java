package exercise1;

public class Main {
    public static void main(String[] args) {
        //1. zadatak
        /*System.out.println("Card Suits:");
        for(CardSuit cs : CardSuit.values()){ //values() vraca sve elemente u okviru enumeracije
            System.out.printf("Ordinal value: %d; Name value: %s\n",cs.ordinal(),cs.name()); //oridnal() vraca vrednost konstante, a name() vraca ime konstante
        }*/
        //2. zadatak
        System.out.println("Card Ranks:");
        for(CardRank cardRank : CardRank.values()){ //values() vraca sve elemente u okviru enumeracije
            System.out.printf("Ordinal value: %d; Name value: %s\n",cardRank.ordinal(),cardRank.name()); //oridnal() vraca vrednost konstante, a name() vraca ime konstante
        }
    }
}
