package org.example;
public class Cliente {
    private String nome, cognome, codiceFiscale;
    public Cliente(String nome, String cognome, String codiceFiscale) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
    }
    public String getNome() {
        return nome;
    }
    public String getCognome() {
        return cognome;
    }
    public String getCodiceFiscale() {
        return codiceFiscale;
    }
    public String toString() {
        return "Nome: " + nome + "\n" + "Cognome" + cognome + "\n" + "Codice Fiscale:" + codiceFiscale + "\n";
    }
}
