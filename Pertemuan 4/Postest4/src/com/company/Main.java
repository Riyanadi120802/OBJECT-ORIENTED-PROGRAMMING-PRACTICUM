package com.company;

public class Main {

    public static void main(String[] args) {
	    Titik titik1 = new Titik(20,30);
        Titik titik2 = new Titik(10,40);
        System.out.println("Ordinat 1 : "+ titik1.getOrdinat());
        System.out.println("Absis 1   : "+titik1.getAbsis());
        System.out.println("Ordinat 2 : "+ titik2.getOrdinat());
        System.out.println("Absis 2   : "+titik2.getAbsis());
        System.out.println("Jarak     : "+titik1.HitungJarak(titik1,titik2));
        System.out.println("==================================================");

        Lingkaran lingkaran1 = new Lingkaran(30);
        System.out.println("Jari-jari Lingkaran : "+lingkaran1.getJari());
        lingkaran1.Luas();
        lingkaran1.Keliling();
        System.out.println("==================================================");

        PersegiPanjang persegiPanjang1 = new PersegiPanjang(10,12);
        System.out.println("Panjang Persegi Panjang  : "+persegiPanjang1.getPanjang());
        System.out.println("Lebar Persegi Panjang    : "+persegiPanjang1.getLebar());
        persegiPanjang1.Luas();
        persegiPanjang1.Keliling();
    }
}
