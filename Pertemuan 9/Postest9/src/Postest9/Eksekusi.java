package Postest9;

import java.io.File;
import java.util.Scanner;

public class Eksekusi {
    public static void main(String[] args) {
        java.io.File namaFile = new File("Postest9.txt");
        Scanner mlebu = new Scanner(System.in);
        System.out.println("\t+--------------------------+");
        System.out.println("\t| Aplikasi Pembelian Balok |");
        System.out.println("\t+--------------------------+");
        System.out.print("Masukkan Panjang Balok : ");
        int panjang = mlebu.nextInt();
        System.out.print("Masukkan Lebar Balok   : ");
        int lebar = mlebu.nextInt();
        System.out.print("Masukkan Tinggi Balok  : ");
        int tinggi = mlebu.nextInt();
        try {
            java.io.PrintWriter tulis = new java.io.PrintWriter(namaFile);
            int rumusVolumeBalok = (panjang * lebar * tinggi);
            if((panjang > lebar) && (lebar > tinggi)){
                System.out.println("Balok dengan ukuran volume : " + rumusVolumeBalok + " cm Terbeli");
                tulis.println("Balok dengan ukuran volume : " + rumusVolumeBalok + " cm Terbeli");
                tulis.close();
            }else{
                throw new Exception("Tolong cek inputan panjang, lebar dan tinggi!!");
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
