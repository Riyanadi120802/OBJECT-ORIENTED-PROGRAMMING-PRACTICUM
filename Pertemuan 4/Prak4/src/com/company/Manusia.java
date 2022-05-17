package com.company;

public class Manusia {
    private String nama;
    private String alamat;

    public Manusia(){} //construktor default

    public Manusia(String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
