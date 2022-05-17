package com.company;

public class Main {

    public static void main(String[] args) {
        Mahasiswa riyan = new Mahasiswa("2000018286", "Riyan Adi Saputro");

        System.out.println("Nama Mahasiswa : "+riyan.getNama());
        System.out.println("NIM Mahasiswa  : "+riyan.getNIM());

        HM aldi = new HM();
        aldi.setSekbid("Keagamaan");
        aldi.setNama("Aldi");
        aldi.setNIM("20000128881");

        System.out.println("Nama Mahasiswa : "+aldi.getNama());
        System.out.println("NIM Mahasiswa  : "+aldi.getNIM());
        System.out.println("NIM Mahasiswa  : "+aldi.getSekbid());
    }
}
