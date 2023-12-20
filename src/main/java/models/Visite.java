package models;

public class Visite {
    private int idVisite;
    private int idPatient;
    private String nom;
    private String prenom;
    private String secuSocialPatient;
    private String typeAnalyse;

    public int getIdPatient() {
        return idPatient;
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

    public void setIdPatient(int idPatient) {
        this.idPatient = idPatient;
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