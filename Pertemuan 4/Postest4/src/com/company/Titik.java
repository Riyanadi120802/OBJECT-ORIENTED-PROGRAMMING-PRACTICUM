package com.company;

public class Titik {
    private int ordinat;
    private int absis;

    public Titik(){}
    public Titik(int ordinat, int absis){
        this.ordinat = ordinat;
        this.absis = absis;
    }
    public int getOrdinat() {
        return ordinat;
    }
    public int getAbsis() {
        return absis;
    }

    float Luas(){
        return 0;
    }
    float Keliling(){
        return 0;
    }
    public float HitungJarak(Titik titik1, Titik titik2){
        float absis = titik1.absis - titik2.absis;
        float ordinat = titik1.ordinat - titik2.ordinat;
        return (float) Math.sqrt(absis*absis + ordinat*ordinat);
    }
}
