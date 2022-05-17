package com.company;

public class PersegiPanjang extends Titik{
    private int panjang;
    private int lebar;

    public PersegiPanjang(){}
    public PersegiPanjang(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public int getPanjang() {
        return panjang;
    }
    public int getLebar() {
        return lebar;
    }

    @Override
    float Luas() {
        int luas = panjang*lebar;
        System.out.println("Luas Persegi Panjang     : "+luas);
        return luas;
    }

    @Override
    float Keliling() {
        int keliling = 2*(panjang+lebar);
        System.out.println("Keliling Persegi Panjang : "+keliling);
        return keliling;
    }
}
