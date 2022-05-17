package com.company;

public class Paus extends Hewan{
    String suara = "Huawoe Huawoe";
    String berenang = "Berenang dengan Sirip";
    public Paus(String Jenis, String ciri) {
        super(Jenis, ciri);
    }

    @Override
    public String Suara() {
        return suara;
    }

    @Override
    public String Berjalan() {
        return berenang;
    }
}
