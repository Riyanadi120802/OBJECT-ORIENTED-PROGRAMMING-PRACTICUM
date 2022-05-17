package com.company;

public class Karyawan {

    private Float gajiTetap = Float.valueOf(3200000);
    private Integer nomorPegawai;
    private String namaPegawai;
    private Integer gajiBonus;
    private Float gajiTotal1;
    private Float gajiTotal2;

    public Karyawan(){
        gajiTetap = Float.valueOf(3200000);
    }
    public Karyawan(String namaPegawai, Integer nomorPegawai ){
        this.namaPegawai = namaPegawai;
        this.nomorPegawai = nomorPegawai;
    }

    public Integer getNomorPegawai() {
        return nomorPegawai;
    }

    public void setNomorPegawai(Integer nomorPegawai) {
        this.nomorPegawai = nomorPegawai;
    }

    public String getNamaPegawai() {
        return namaPegawai;
    }

    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }

    public Integer getGajiBonus() {
        return gajiBonus;
    }

    public void setGajiBonus(Integer gajiBonus) {
        this.gajiBonus = gajiBonus;
    }

    public Float getGajiTotal1(){
        Float gajiTetap = this.gajiTetap;
        gajiTotal1 = gajiTetap;
        return gajiTotal1;
    }

    public Float getGajiTotal2(){
        Float gajiTetap = this.gajiTetap;
        gajiTotal2 = gajiTetap + gajiBonus;
        return gajiTotal2;
    }

}


