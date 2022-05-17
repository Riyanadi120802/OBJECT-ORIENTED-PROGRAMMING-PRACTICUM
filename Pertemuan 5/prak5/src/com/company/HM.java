package com.company;

public class HM extends Mahasiswa{
    String Sekbid;

    public String getSekbid() {
        return Sekbid;
    }

    public void setSekbid(String sekbid) {
        Sekbid = sekbid;
    }

    @Override
    public String getNama() {
        return super.getNama();
    }

    @Override
    public String getNIM() {
        return super.getNIM();
    }

    public void getNama(String aldi_eka) {
    }
}
