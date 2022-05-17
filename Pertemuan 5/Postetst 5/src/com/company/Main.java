package com.company;

public class Main {

    public static void main(String[] args) {
        Hewan Besar = new Hewan("Universal","Omnivora");
        System.out.println("Jenis Hewannya\t\t : "+Besar.Jenis);
        System.out.println("Ciri-ciri Hewannya\t : "+Besar.ciri);
        System.out.println("Suaranya\t\t\t : "+Besar.Suara());
        System.out.println("Bergerak dengan\t\t : "+Besar.Berjalan());

        Hewan Jawa = new Singa("Jawa","Pemangsa");
        System.out.println("====Singa====");
        System.out.println("Jenis Singa\t\t\t : "+Jawa.Jenis);
        System.out.println("Ciri-ciri Singa\t\t : "+Jawa.ciri);
        System.out.println("Suara Singa\t\t\t : "+Jawa.Suara());
        System.out.println("Berjalan dengan\t\t : "+Jawa.Berjalan());

        Hewan Sumatera = new Elang("Sumatera","Matanya merah");
        System.out.println("====Elang====");
        System.out.println("Jenis Elang\t\t\t : "+Sumatera.Jenis);
        System.out.println("Ciri-ciri Elang\t\t : "+Sumatera.ciri);
        System.out.println("Suara Elang\t\t\t : "+Sumatera.Suara());
        System.out.println("Bergerak dengan\t\t : "+Sumatera.Berjalan());

        Hewan Madu = new Lebah("Madu","Penghasil Madu");
        System.out.println("====Lebah====");
        System.out.println("Jenis Lebah\t\t\t : "+Madu.Jenis);
        System.out.println("Ciri-ciri Lebah\t\t : "+Madu.ciri);
        System.out.println("Suara Lebah\t\t\t : "+Madu.Suara());
        System.out.println("Bergerak dengan\t\t : "+Madu.Berjalan());

        Hewan Sperma = new Paus("Sperma","Kepalanya Besar");
        System.out.println("====Paus====");
        System.out.println("Jenis Paus\t\t\t : "+Sperma.Jenis);
        System.out.println("Ciri-ciri Paus\t\t : "+Sperma.ciri);
        System.out.println("Suara Paus\t\t\t : "+Sperma.Suara());
        System.out.println("Bergerak dengan\t\t : "+Sperma.Berjalan());
    }
}
