package exercise3;

public enum CardSuit {
    CLUBS(0), //dodeljujemo nove vrednosti konstanti na stara imena
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private int power; //dodajemo privatan atribut koji oznacava nove vrednosti konstanti

    CardSuit(int power) { //prateci kontruktor
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}
