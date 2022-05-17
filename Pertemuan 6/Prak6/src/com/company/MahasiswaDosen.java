package com.company;

public class MahasiswaDosen {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("2000018286","Riyan adi Saputro");
        Mahasiswa mhs2 = new Mahasiswa("200018267","Ilham Setyawan");
            Dosen dsn = new Dosen("2001API");
            dsn.setNimMHS(mhs1.getNim());
            dsn.setNimMHS(mhs2.getNim());
            dsn.daftarMahasiswa();
    }
}
