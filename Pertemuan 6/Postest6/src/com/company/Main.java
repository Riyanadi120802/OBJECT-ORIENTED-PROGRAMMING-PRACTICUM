package com.company;

public class Main {

    public static void main(String[] args) {
	    Rekening rek1 = new Rekening("20120",1000000);
        Nasabah riyan = new Nasabah("Riyan Adi Saputro","Sragen");
        riyan.bukaRekening(rek1);
        riyan.getRekening();
        rek1.deposit(2000000);
        System.out.println("===Setelah dideposit("+ rek1.deposit+")===");
        riyan.getRekening();
        rek1.withdraw(1800000);
        System.out.println("===Setelah di withdraw("+rek1.withdraw+")===");
        riyan.getRekening();

    }
}
