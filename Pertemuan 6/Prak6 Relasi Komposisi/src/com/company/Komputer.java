package com.company;

public class Komputer {
    private String Kode;
    private long Harga;
    private CPU Proc;           //Relasi Komposisi
    private Monitor Mon;        //Relasi Komposisi
    private Printer Prn ;       //Relasi Komposisi
    public Komputer(String k, long h) {
        this.Kode = k;
        this.Harga = h;
        if (k == "PC-01") {
            Proc = new CPU("Pentium IV", 500);
            Mon = new Monitor("Sony Multiscan 15sf");
            Prn = new Printer("Canon BJC-210SP", "Color");
        }
    }
    public void DisplaySpec() {
        System.out.println("Kode : " + this.Kode);
        System.out.print("Processor: ");
        Proc.DisplaySpecCPU();
        System.out.print("Monitor : ");
        Mon.DisplaySpecMonitor();
        System.out.print("Printer : ");
        Prn.DisplaySpecPrinter();
        System.out.println("Harga   : Rp. " + this.Harga);
    }
}