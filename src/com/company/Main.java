package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
       Cow cow1 = new Cow(89,2,"cow", "Curly cow");
        Cow cow2 = new Cow(34,1,"Bull", "Curly bull");
        Cow cow3 = new Cow(689,4,"cow", "black cow");
        Cow cow4 = new Cow(324,23,"bul", "green bull");
        Cow cow5 = new Cow(89,2,"cow", "red cow");
        Cow cow6 = new Cow(89,2,"cow", "Curly cow");
        Cow[]cows = {cow1,cow2,cow3,cow4,cow5};
        Cow[]cows1 = {cow6};
        Sheep sheep1 = new Sheep(1,3,"female", "black");
        Sheep sheep2 = new Sheep(23,24,"male", "grey");
        Sheep sheep3 = new Sheep(2251,2,"female", "black");
        Sheep sheep4 = new Sheep(21,6,"female", "red");
        Sheep[]sheeps = {sheep1, sheep2, sheep3};
        Sheep[]sheeps1 = { sheep4};

        Horse horse1 = new Horse(123,3,"male","at");
        Horse horse2 = new Horse(123,3,"male","at");
        Horse horse3 = new Horse(123,3,"male","at");
        Horse[] horses = {horse1, horse2};
        Horse[]horses1 = {horse3};
        System.out.println();
        Farm farm = new Farm("Batren","Ermek", cows, sheeps, horses);
        System.out.println(farm);
        System.out.println();
        Farm farm1 = new Farm("Kyrgyzstan","Omurbek", cows1, sheeps1, horses1);
        System.out.println(farm1);




    }
}
