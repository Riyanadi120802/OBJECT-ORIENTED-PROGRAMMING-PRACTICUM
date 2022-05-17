package com.company;

public class Main {

    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("2000018286","Riyan Adi Saputro");
        Mahasiswa mhs2 = new Mahasiswa("2000018100", "SetyanJadi");

        Jurusan TI = new Jurusan("182", "Teknik Informatika");
        TI.AddMahasiswa(mhs1);
        TI.AddMahasiswa(mhs2);
        TI.DisplayMahasiswa();
        System.out.println(mhs1.GetNIM());

    }
}
