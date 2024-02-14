package exercise5;

import java.util.Scanner;

public class Engine {
    private Scanner scanner = new Scanner(System.in);
    private Jedi jedi;
    private Evil evil;
    private String command;

    public Engine(Scanner scanner, Jedi jedi, Evil evil) {
        this.scanner = scanner;
        this.jedi = jedi;
        this.evil = evil;
        this.command = "";
    }

    public void run(){
        command = scanner.nextLine();
        while(!command.equals("Let the Force be with you")){
            int[] jediPosition = InputParser.parseIntegerArray(command);
            int jediRow = jediPosition[0];
            int jediCol = jediPosition[1];

            command = scanner.nextLine();

            int[] evilPosition = InputParser.parseIntegerArray(command);
            int evilRow = evilPosition[0];
            int evilCol = evilPosition[1];

            evil.destroyStars(evilRow,evilCol);
            jedi.collectStars(jediRow,jediCol);

            command = scanner.nextLine();
        }
    }
}
