package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int nilai;

        Scanner Input = new Scanner(System.in);
        System.out.print("Masukkan Nilai : ");
        nilai = Input.nextInt();

        if(nilai >=80 && nilai <=100){
            System.out.println("Nilai Anda : A ");
        }else if (nilai >=65 && nilai <=79){
            System.out.println("Nilai Anda : B ");
        }else if (nilai >=55 && nilai <=64){
            System.out.println("Nilai Anda : C ");
        }else if (nilai >=40 && nilai <=54){
            System.out.println("Nilai Anda : D ");
        }else if (nilai >=0 && nilai <=39){
            System.out.println("Nilai Anda : E ");
        }else{
            System.out.println("Nilai tidak tersedia!!");
        }
    }
}
