package com.company;

public class Hewan {
    public String Jenis;
    public String ciri;

    public String getJenis() {
        return Jenis;
    }

    public String getCiri() {
        return ciri;
    }

    public Hewan(String Jenis, String ciri){
        this.Jenis = Jenis;
        this.ciri = ciri;
    }

    public String Suara(){
        return "Tidak Bersuara";
    }

    public String Berjalan(){
        return "Tidak Berjalan";
    }
}
