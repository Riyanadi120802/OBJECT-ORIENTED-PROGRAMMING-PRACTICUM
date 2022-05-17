package com.company;

public class Elang extends Hewan{
    String Suara = "Kuawak Kuawak";
    String Berjalan = "Dengan Sayapnya";

    Elang(String Jenis, String ciri) {
        super(Jenis, ciri);
    }

    @Override
    public String Suara() {
        return Suara;
    }

    @Override
    public String Berjalan() {
        return Berjalan;
    }
}
