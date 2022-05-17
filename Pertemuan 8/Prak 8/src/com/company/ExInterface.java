package com.company;

public class ExInterface {
    public static void main(String[] args) {
        FourDigitsNumber number1 = new FourDigitsNumber(700);
        FourDigitsNumber number2 = new FourDigitsNumber(1700);
        FourDigitsNumber number3 = new FourDigitsNumber(70000);
        System.out.println("number 1 : "+number1.getValue());
        System.out.println("number 2 : "+number2.getValue());
        System.out.println("number 3 : "+number3.getValue());
        System.out.println(number1.graterThan(number2));
        System.out.println(number1.lessThan(number2));
        System.out.println(number1.equal(number2));
    }
}
