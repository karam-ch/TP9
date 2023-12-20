package models;

public class Patient {
    private int idPatient;
    private String nom;
    private String prenom;
    private String secuSocialPatient;
    private String typeAnalyse;

    public Patient(String nom, String prenom, String secuSocialPatient, String typeAnalyse) {
        this.nom = nom;
        this.prenom = prenom;
        this.secuSocialPatient = secuSocialPatient;
        this.typeAnalyse = typeAnalyse;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getSecuSocialPatient() {
        return secuSocialPatient;
    }

    public String getTypeAnalyse() {
        return typeAnalyse;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setSecuSocialPatient(String secuSocialPatient) {
        this.secuSocialPatient = secuSocialPatient;
    }

    public void setTypeAnalyse(String typeAnalyse) {
        this.typeAnalyse = typeAnalyse;
    }
}