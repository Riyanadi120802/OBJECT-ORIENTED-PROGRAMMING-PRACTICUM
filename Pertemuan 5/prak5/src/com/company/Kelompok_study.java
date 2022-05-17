package com.company;

public class Kelompok_study extends Mahasiswa{
    String Nama_Study;

    public Kelompok_study(){

    }

    public String getNama_Study() {
        return Nama_Study;
    }

    public void setNama_Study(String nama_Study) {
        Nama_Study = nama_Study;
    }

    @Override
    public String getNama() {
        return super.getNama();
    }

    @Override
    public String getNIM() {
        return super.getNIM();
    }
}
