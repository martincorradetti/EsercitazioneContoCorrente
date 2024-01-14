package org.example;

public class ContoCorrentePremium extends ContoCorrente {
    private Cliente cliente;
    private int identificativo;
    private double saldo;
    public ContoCorrentePremium(int identificativo, Cliente cliente) {
        this.identificativo = identificativo;
        this.cliente = cliente;
        this.saldo = 0;
    }
    @Override
    public void deposita(int denaro) {
        if (denaro <= 0)
            System.out.println("Depositare una cifra positiva");
        else
            this.saldo = saldo + ((denaro / 100) * 101);
    }
    @Override
    public void preleva(int denaro) {
        if (this.saldo - denaro < 0)
            System.out.println("Non e' possibile prelevare una cifra superiore al saldo attuale");
        else
            this.saldo = saldo - denaro;
    }
    @Override
    public void stampaSaldo() {
    }
}
