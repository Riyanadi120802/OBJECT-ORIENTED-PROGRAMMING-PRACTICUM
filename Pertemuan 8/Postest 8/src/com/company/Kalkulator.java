package com.company;

import java.util.Scanner;

public class Kalkulator {

    public static void main(String[] args){
        int pil1;
        char pil2;
        do {
            Scanner masuk = new Scanner(System.in);
            System.out.println("=======================");
            System.out.print("Masukkan Bilangan 1 : ");
            int bil1 = masuk.nextInt();
            System.out.print("Masukkan Bilangan 2 : ");
            int bil2 = masuk.nextInt();
            System.out.println("=======================");
            System.out.println("+-----------------+");
            System.out.println("|     Pilihan     |");
            System.out.println("+-----------------+");
            System.out.println("| 1. Penjumlahan  |");
            System.out.println("| 2. Pengurangan  |");
            System.out.println("| 3. Perkalian    |");
            System.out.println("| 4. Pembagian    |");
            System.out.println("+-----------------+");
            System.out.print("Masukkan pilihan anda : ");
            pil1 = masuk.nextInt();
            switch (pil1){
                case 1 :
                    Rumus jumlah = new Rumus(bil1, bil2);
                    jumlah.Penjumlahan();
                    break;

                case 2 :
                    Rumus kurang = new Rumus(bil1,bil2);
                    kurang.Pengurangan();
                    break;
                case 3 :
                    Rumus kali = new Rumus(bil1,bil2);
                    System.out.println("Hasil perkalian bilangan 1 dan bilangan 2 :"+kali.Perkalian());
                    break;
                case 4 :
                    Rumus bagi = new Rumus(bil1,bil2);
                    System.out.println("Hasil pembagian bilangan 1 dan bilangan 2 : "+bagi.Pembagian());
                    break;
                default:
                    System.out.println("Pilihan yang anda masukkan salah!!");
                    break;
            }
            System.out.print("Apakah mau mengulangi lagi y/n : ");
            pil2 = masuk.next().charAt(0);
        }while(pil2 == 'y' || pil2 == 'Y');
    }
}
