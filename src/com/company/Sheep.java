package com.company;

public class Sheep extends Domesticanimals{
    public Sheep(int weight, int age, String gender, String nickName) {
        super(weight, age, gender, nickName);
    }

    @Override
    public String toString() {
        return "Sheep{} " + super.toString();
    }
}
