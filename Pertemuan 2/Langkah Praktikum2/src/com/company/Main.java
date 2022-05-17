package com.company;

public class Main {

    public static void main(String[] args) {
	    PersegiPanjang masuk = new PersegiPanjang();
        masuk.setPanjang(30);
        masuk.setLebar(60);

        System.out.println("Panjang Persegi Panjang  : " + masuk.getPanjang());
        System.out.println("Lebar Persegi Panjang    : " + masuk.getLebar());

        System.out.println("Luas Persegi Panjang     : " + masuk.getLuas());
        System.out.println("Keliling Persegi Panjang : " + masuk.getKeliling());
    }
}
