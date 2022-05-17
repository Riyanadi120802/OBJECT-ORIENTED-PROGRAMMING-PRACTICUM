package com.company;

public class Dosen {
    private String Kddosen;
    private String[] nimMHS = new String[5];  //ini merupakan penerapan relasi asosiasi
    private int jmlMahasiswa = 0;

    public Dosen(String kode){
        this.Kddosen = kode;
    }

    public void setKddosen(String kddosen) {
        Kddosen = kddosen;
    }

    public void setNimMHS(String nim) {
        nimMHS[jmlMahasiswa]=nim;
        jmlMahasiswa++;
    }

    public int getJmlMahasiswa() {
        return this.jmlMahasiswa;
    }

    public String getKddosen() {
        return Kddosen;
    }
    public void daftarMahasiswa(){
        System.out.println("Kode dosen "+Kddosen);
        System.out.println("Daftar Mahasiswa : ");
        for (int i = 0; i<jmlMahasiswa; i++){
            System.out.println(nimMHS[i]);
            System.out.println();
        }
    }
}
