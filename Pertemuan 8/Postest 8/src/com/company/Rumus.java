package com.company;

public class Rumus implements Operasi{

    public int bil1;
    public int bil2;

    public Rumus (int bilangan1, int bilangan2){
        this.bil1 = bilangan1;
        this.bil2 = bilangan2;
    }

    public int getBil1() {
        return bil1;
    }

    public void setBil1(int bil1) {
        this.bil1 = bil1;
    }

    public int getBil2() {
        return bil2;
    }

    public void setBil2(int bil2) {
        this.bil2 = bil2;
    }

    @Override
    public void Penjumlahan() {
        int jumlah = bil1 + bil2;
        System.out.println("Hasil penjumlahan bilangan 1 dan bilangan 2 : "+jumlah);
    }

    @Override
    public void Pengurangan() {
        int kurang = bil1 - bil2;
        System.out.println("Hasil penjumlahan bilangan 1 dan bilangan 2 : "+kurang);
    }

    @Override
    public double Pembagian() {
        double bagi = bil1 / bil2;
        return bagi;
    }

    @Override
    public double Perkalian() {
        double kali = bil1 * bil2;
        return kali;
    }
}
