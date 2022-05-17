package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        float jari;
        double keliling;
        double luas;
        double phi = 3.14;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Program menghitung Keliling Lingkaran dan Luas Lingkaran");
        System.out.print("Masukkan Jari-jari : ");
        jari = keyboard.nextFloat();

        keliling = 2*phi*jari;
        luas = phi*jari*jari;

        System.out.println("Keliling Lingkaran  : " + keliling);
        System.out.println("Luas Lingkaran      : " + luas);
    }
}
