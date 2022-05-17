package com.company;

public class Printer {
    private String Merk, Type;

    public Printer(String m, String t) {
        this.Merk = m;
        this.Type = t;
    }
    public void DisplaySpecPrinter() {
        System.out.println(this.Merk + ", " + this.Type);
    }
}
