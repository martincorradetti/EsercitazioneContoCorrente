package org.example;

public class ContoCorrenteBase extends ContoCorrente {
    public ContoCorrenteBase(int identificativo, Cliente cliente) {
        super(identificativo, cliente);
        saldo = 0;
}
    @Override
    public void deposita(int denaro) {
        if (denaro <= 0)
            System.out.println("Depositare una cifra positiva");
        else
            this.saldo = saldo + denaro;
    }
    @Override
    public void preleva(int denaro) {
        if (this.saldo - denaro -1 < 0)
            System.out.println("Non e' possibile prelevare una cifra superiore al saldo attuale piu' il costo del prelievo");
        else
            this.saldo = saldo - denaro - 1;
    }
    @Override
    public void stampaSaldo() {
        System.out.println(saldo);
    }
}
