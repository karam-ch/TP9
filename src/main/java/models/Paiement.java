package models;
import java.time.LocalDate;

public class Paiement {
    private int idPaiement;
    private int idVisite;
    private String numeroCarte;
    private LocalDate dateExpiration;
    private int cryptogramme;

    public Paiement(String numeroCarte, LocalDate dateExpiration, int cryptogramme) {
        this.numeroCarte = numeroCarte;
        this.dateExpiration = dateExpiration;
        this.cryptogramme = cryptogramme;
    }

    public int getIdVisite() {
        return idVisite;
    }

    public String getNumeroCarte() {
        return numeroCarte;
    }

    public LocalDate getDateExpiration() {
        return dateExpiration;
    }

    public int getCryptogramme() {
        return cryptogramme;
    }

    public void setIdVisite(int idVisite) {
        this.idVisite = idVisite;
    }

    public void setNumeroCarte(String numeroCarte) {
        this.numeroCarte = numeroCarte;
    }

    public void setDateExpiration(LocalDate dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public void setCryptogramme(int cryptogramme) {
        this.cryptogramme = cryptogramme;
    }
}