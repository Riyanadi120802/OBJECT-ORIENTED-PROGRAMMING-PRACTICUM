package com.company;

public class Lebah extends Hewan{
    String suara = "Wengwengweng";
    String terbang = "Terbang dengan Sayap";
    public Lebah(String Jenis, String ciri) {
        super(Jenis, ciri);
    }

    @Override
    public String Suara() {
        return suara;
    }

    @Override
    public String Berjalan() {
        return terbang;
    }
}
