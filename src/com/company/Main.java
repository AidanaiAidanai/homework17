package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Domesticanimals cow = new Cow(89,3,"cow", "bigCow");
        Domesticanimals sheep = new Sheep(30,3,"sheep", "curlySheep");
        Domesticanimals horse = new Horse(344, 2,"horse","blackHorse", "black");

        Farm farm = new Farm("bishkek","ermek");
       System.out.println(farm);

        Domesticanimals[]animals = {cow, horse, sheep};
        System.out.println(animals);
        for (Domesticanimals animal : animals) {
            System.out.println(animal);
        }
        System.out.println();
       Farm farm1 = new Farm("Batken", "ermek2");
        System.out.println(farm1);
        Domesticanimals[]farms = {cow,cow, cow, horse,horse,sheep, sheep};
        for (Domesticanimals farms1 : farms) {
            System.out.println(farms1);

        }

    }
}
