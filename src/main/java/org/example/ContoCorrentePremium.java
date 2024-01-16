package org.example;

public class ContoCorrentePremium extends ContoCorrente {
    public ContoCorrentePremium(int identificativo, Cliente cliente) {
        super(identificativo, cliente);
        saldo = 0;
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
        System.out.println(saldo);
    }
}
