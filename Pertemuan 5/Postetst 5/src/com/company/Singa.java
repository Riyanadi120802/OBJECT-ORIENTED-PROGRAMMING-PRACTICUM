package com.company;

public class Singa extends Hewan{
    String Suara = "HruowaHruowa";
    String Jalan = "Dengan 4 kaki, Berlari";
    Singa(String Jenis, String ciri) {
        super(Jenis, ciri);
    }

    @Override
    public String Suara() {
        return Suara;
    }

    @Override
    public String Berjalan() {
        return Jalan;
    }
}
