package models;

public class Medecin {
    private int idMedecins;
    private String nom;
    private String prenom;
    private String secuSocialMedecin;
    private double salaire;
    private boolean authorisation;

    public Medecin(String nom, String prenom, String secuSocialMedecin, double salaire, boolean authorisation) {
        this.nom = nom;
        this.prenom = prenom;
        this.secuSocialMedecin = secuSocialMedecin;
        this.salaire = salaire;
        this.authorisation = authorisation;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getSecuSocialMedecin() {
        return secuSocialMedecin;
    }

    public double getSalaire() {
        return salaire;
    }

    public boolean isAuthorisation() {
        return authorisation;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setSecuSocialMedecin(String secuSocialMedecin) {
        this.secuSocialMedecin = secuSocialMedecin;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public void setAuthorisation(boolean authorisation) {
        this.authorisation = authorisation;
    }
}