package org.example;
public abstract class ContoCorrente {
    protected int identificativo;
    protected double saldo;
    protected Cliente cliente;
    public ContoCorrente(int identificativo, Cliente cliente) {
        this.identificativo = identificativo;
        this.cliente = cliente;
        this.saldo = 0;
    }
    public abstract void deposita(int denaro);
    public abstract void preleva(int denaro);
    public abstract void stampaSaldo();
}
