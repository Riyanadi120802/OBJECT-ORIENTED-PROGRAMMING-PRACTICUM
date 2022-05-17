package com.company;

public class Nasabah{
    private String nama;
    private String alamat;
    private Rekening[] rek = new Rekening[5]; //Relasi Agregasi

    public Nasabah (String nm, String Almt){
        this.nama = nm;
        this.alamat = Almt;
    }
    private static Integer jmlhRekening = 0;    //inisialisasi nilai awal jumlah Rekening = 0;
    public void bukaRekening(Rekening isi){     //fungsi berparameter objek Rekening
        this.rek[jmlhRekening] = isi;
        this.jmlhRekening++;
    }
    public static Integer getJmlhRekening() {
        return jmlhRekening;
    }  //getter Jumlah Rekening
    public void getRekening() {                                        // fungsi void menampilkan deskripsi rekening
        int i;
        for (i=0; i<jmlhRekening; i++){
            System.out.println("Nama Nasabah   : "+this.nama);
            System.out.println("Alamat Nasabah : "+this.alamat);
            System.out.println("No rekening    : "+rek[i].getNoRekening());
            System.out.println("Saldo          : "+rek[i].getSaldo());
        }
    }
}
