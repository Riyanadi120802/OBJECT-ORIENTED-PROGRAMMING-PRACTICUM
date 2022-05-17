package com.company;

public class Main {

    public static void main(String[] args) {
	    Mahasiswa riyan = new Mahasiswa();
        riyan.setNim("2000018286");
        riyan.setNama("Riyan Adi Saputro");
        riyan.setAlamat("Sragen Jawa Tengah");

        System.out.println("NIM    : "+riyan.getNim());
        System.out.println("Nama   : "+riyan.getNama());
        System.out.println("Alamat : "+riyan.getAlamat());
    }
}
