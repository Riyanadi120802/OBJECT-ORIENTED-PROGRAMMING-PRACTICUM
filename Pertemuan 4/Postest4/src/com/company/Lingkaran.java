package com.company;

public class Lingkaran extends Titik{
    private float jari;

    public Lingkaran(){}

    public Lingkaran(float jari){
        this.jari = jari;
    }
    public float getJari() {
        return jari;
    }
    public void setJari(float jari) {
        this.jari = jari;
    }

    @Override
    float Luas() {
        float luas = (float) (Math.PI*jari*jari);
        System.out.println("Luas Lingkaran      : "+luas);
        return luas;
    }

    @Override
    float Keliling() {
        float kelling = (float) (2 * Math.PI*jari);
        System.out.println("Keliling Lingkaran  : "+kelling);
        return kelling;
    }
}
