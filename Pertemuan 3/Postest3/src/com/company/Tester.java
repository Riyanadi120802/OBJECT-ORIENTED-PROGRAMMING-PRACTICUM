package com.company;


public class Tester {
    public static void main(String[] args){
        Karyawan KaryawanBaru = new Karyawan("Ucup", 2001);
        System.out.println("Nama Karyawan Baru       : " + KaryawanBaru.getNamaPegawai());
        System.out.println("Nomor Karyawan Baru      : " + KaryawanBaru.getNomorPegawai());
        System.out.println("Gaji Total Karyawan Lama : " + KaryawanBaru.getGajiTotal1());

        System.out.println("----------------------------------------------------------");

        Karyawan KaryawanLama = new Karyawan("Suryo",1090 );
        KaryawanLama.setGajiBonus(700000);

        System.out.println("Nama Karyawan Lama       : " + KaryawanLama.getNamaPegawai());
        System.out.println("Nomor Karyawan Lama      : " + KaryawanLama.getNomorPegawai());
        System.out.println("Gaji Bonus Karyawan Baru : " + KaryawanLama.getGajiBonus());
        System.out.println("Gaji Total Karyawan Baru : " + KaryawanLama.getGajiTotal2());


    }
}
