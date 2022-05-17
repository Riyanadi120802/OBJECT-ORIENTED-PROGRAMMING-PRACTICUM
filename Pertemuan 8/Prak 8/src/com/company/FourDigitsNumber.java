package com.company;

public class FourDigitsNumber implements MyComparable, Constans{
    private int value;
    //latihan 1
    public FourDigitsNumber (int initValue){
        if(initValue>=min && initValue<=max){
            this.value = initValue;
        }
    }
    //latihan 2
    public int getValue() {
        return value;
    }

    @Override
    public boolean graterThan(Object obj) {
        FourDigitsNumber number = (FourDigitsNumber) obj;
        return (value > number.getValue());
    }
    //latihan 3 melengkapi class overidding
    @Override
    public boolean lessThan(Object obj) {
        FourDigitsNumber number = (FourDigitsNumber) obj;
        return (value < number.getValue());
    }

    @Override
    public boolean equal(Object obj) {
        FourDigitsNumber number = (FourDigitsNumber) obj;
        return (value == number.getValue());
    }
}
