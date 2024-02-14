package exercise5;

import java.util.Arrays;
import java.util.Scanner;

public class MainNotRefactored {
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimestions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray(); //ucitavanje dimenzija
        int x = dimestions[0]; //broj redova
        int y = dimestions[1]; //broj kolona

        int[][] matrix = new int[x][y]; //inicijalizacija matrice

        int value = 0;
        for (int i = 0; i < x; i++)
        {
            for (int j = 0; j < y; j++)
            {
                matrix[i][j] = value++; //popunjavanje matrice vrednostima
            }
        }

        String command = scanner.nextLine();
        long sum = 0;
        while (!command.equals("Let the Force be with you"))
        {
            int[] ivoS = Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray(); //pozicija jedi-ja
            int[] evil = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray(); //pozicija evail-a
            int xE = evil[0]; //red pozicije evil
            int yE = evil[1]; //red pozicije evil

            while (xE >= 0 && yE >= 0) //dok se nije stiglo do kraja unosa (dosao do leve ili gornje ivice)
            {
                if (xE >= 0 && xE < matrix.length && yE >= 0 && yE < matrix[0].length) // vrednost se nalazi u matrici
                {
                    matrix[xE] [yE] = 0; //postavlja se na 0
                }
                xE--; //pomeranje dijagonalno
                yE--;
            }

            int xI = ivoS[0]; // pozicija jedi-ja
            int yI = ivoS[1];

            while (xI >= 0 && yI < matrix[1].length) //dok ne predje gornju ili desnu ivicu
            {
                if (xI >= 0 && xI < matrix.length && yI >= 0 && yI < matrix[0].length) //ako je u granicama matrice, dodajemo ukunom zbiru
                {
                    sum += matrix[xI][yI];
                }

                yI++; //pomeranje dijagonalno
                xI--;
            }

            command = scanner.nextLine();
        }

        System.out.println(sum);


    }*/
}
