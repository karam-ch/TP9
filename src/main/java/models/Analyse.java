package models;

public class Analyse {
    private int idAnalyse;
    private boolean hemogramme;
    private String groupeSanguin;
    private int vitesseSedimentation;

    public Analyse(boolean hemogramme, String groupeSanguin, int vitesseSédimentation) {
        this.hemogramme = hemogramme;
        this.groupeSanguin = groupeSanguin;
        this.vitesseSedimentation = vitesseSédimentation;
    }

    public boolean isHemogramme() {
        return hemogramme;
    }

    public String getGroupeSanguin() {
        return groupeSanguin;
    }

    public int getVitesseSédimentation() {
        return vitesseSedimentation;
    }

    public void setHemogramme(boolean hemogramme) {
        this.hemogramme = hemogramme;
    }

    public void setGroupeSanguin(String groupeSanguin) {
        this.groupeSanguin = groupeSanguin;
    }

    public void setVitesseSédimentation(int vitesseSedimentation) {
        this.vitesseSedimentation = vitesseSedimentation;
    }


}