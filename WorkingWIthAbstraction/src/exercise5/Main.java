package exercise5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimensionsField = InputParser.parseIntegerArray(scanner.nextLine());

        int rows = dimensionsField[0];
        int columns = dimensionsField[1];

        Galaxy galaxy = new Galaxy(new Field(new int[rows][columns]));
        Evil evil = new Evil(galaxy);
        Jedi jedi = new Jedi(galaxy);
        Engine engine = new Engine(scanner,jedi,evil);
        engine.run();
        System.out.println(jedi.getPoints());
    }
}
