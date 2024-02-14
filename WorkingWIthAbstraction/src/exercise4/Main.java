package exercise4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] trafficLightsTokens = sc.nextLine().split("\\s+"); //neodredjen broj pocetnih semafora, zadat kao niz stringova
        int n = Integer.parseInt(sc.nextLine()); //broj puta koliko se semafori menjaju
        List<TrafficLight> trafficLightList = new ArrayList<>(); //lista za objekte klase TrafficLight

        for (String trafficLightString : trafficLightsTokens) { //pretvaranje iz Stringova u objkete TrafficLight
            Color color = Color.valueOf(trafficLightString);
            TrafficLight trafficLight = new TrafficLight(color);
            trafficLightList.add(trafficLight); //dodavanje u listu
        }

        for (int i = 0; i < n; i++) { //onoliko iteracija koliko je zadato
            for(TrafficLight trafficLight : trafficLightList){
                trafficLight.changeColor(); //menjanje boje
                System.out.print(trafficLight.getColor() + " ");
            }
            System.out.println();
        }
    }
}
