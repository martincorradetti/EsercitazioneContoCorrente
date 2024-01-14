package org.example;

public class Main
{
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Luca", "Rossi", "LCARSS12345");
        ContoCorrente cc = new ContoCorrenteBase(1, cliente);
        cc.deposita(10);
        cc.preleva(4);
        cc.stampaSaldo();
    }
}
