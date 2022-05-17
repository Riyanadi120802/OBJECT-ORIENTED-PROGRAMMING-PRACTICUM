package com.company;

import java.util.Scanner;

class Waktu{
    private int jam = 0;
    private int menit = 0 ;
    private int detik = 0;

    public String getInput(){
        System.out.println("=====================================");
        System.out.println("||Program menghitung konversi waktu||");
        System.out.println("=====================================");
        System.out.println("");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukkan detik untuk ditentukan ke jam menit detik : ");
        detik=keyboard.nextInt();
        return detik +" detik";
    }

    public void getLamawaktu(){
        jam = detik/3600;
        menit = (detik%3600)/60;
        detik = ((detik%3600)%60);
        System.out.print("Hasil Konversi \t\t\t\t\t: ");
        System.out.println(jam+" jam : "+menit+" menit : "+detik+" detik");
    }
}
public class Main {

    public static void main(String[] args) {
        Waktu waktu = new Waktu();
        System.out.println("Detik yang dimasukkan  \t\t\t: "+waktu.getInput());
        waktu.getLamawaktu();
    }
}
