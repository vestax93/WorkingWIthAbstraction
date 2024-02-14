package exercise3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CardRank cardRank = CardRank.valueOf(sc.nextLine()); //metoda valueOf pretvara iz stringa u enum
        CardSuit cardSuit = CardSuit.valueOf(sc.nextLine());


        System.out.printf("Card name: %s of %s; Card power: %d",cardRank.name(),cardSuit.name(),cardRank.getPower() + cardSuit.getPower()); //ime broja, ime znak i sabrane vrednosti konstanti za broj i znak
    }
}
