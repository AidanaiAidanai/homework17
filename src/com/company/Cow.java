package com.company;

public class Cow extends Domesticanimals{
    public Cow(int weight, int age, String gender, String nickName) {
        super(weight, age, gender, nickName);
    }

    @Override
    public String toString() {
        return "Cow{} " + super.toString();
    }
}
