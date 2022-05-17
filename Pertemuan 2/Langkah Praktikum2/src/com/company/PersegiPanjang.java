package com.company;

import java.util.Scanner;

public class PersegiPanjang {
    private int panjang;
    private int lebar;

    public int getPanjang(){
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public PersegiPanjang(){}

    public PersegiPanjang(Integer panjang, Integer lebar){

        this.panjang=panjang;
        this.lebar=lebar;
    }

    public Integer getLuas(){
        return panjang * lebar;
    }

    public Integer getKeliling(){
        return 2*(panjang+lebar);
    }
}
