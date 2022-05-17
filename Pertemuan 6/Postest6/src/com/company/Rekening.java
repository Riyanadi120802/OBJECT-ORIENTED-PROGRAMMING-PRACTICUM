package com.company;

public class Rekening {
    private String noRekening;
    private double Saldo;

    public Rekening(String noRek, double Saldo){
        this.noRekening = noRek;
        this.Saldo = Saldo;
    }
    double deposit;
    public double deposit(double deposit)
    {
        this.deposit = deposit;
        return Saldo += deposit;
    }
    double withdraw;
    public double withdraw(double withdraw){
        this.withdraw = withdraw;
        return Saldo -=withdraw;
    }

    public double getSaldo() {
        return Saldo;
    }

    public String getNoRekening() {
        return noRekening;
    }
}
