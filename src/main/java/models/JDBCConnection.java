package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class JDBCConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/jdbc";
    private static final String UTILISATEUR = "root";
    private static final String MOT_DE_PASSE = "password";

    public static void main(String[] args) {
        Connection connexion = getConnexion();

        try (Connection connection = DriverManager.getConnection(URL, UTILISATEUR, MOT_DE_PASSE);
                 Statement statement = connection.createStatement()) {

            String createAnalyseTable = "CREATE TABLE Analyse (" +
                    "id BIGINT PRIMARY KEY AUTO_INCREMENT," +
                    "hemogramme Boolean," +
                    "groupeSanguin String," +
                    "vitesseSedimentation INT," +
                    ")";
            statement.executeUpdate(createAnalyseTable);

            String createMedecinTable = "CREATE TABLE Medecin (" +
                    "id BIGINT PRIMARY KEY AUTO_INCREMENT," +
                    "nom VARCHAR(255)," +
                    "prenom VARCHAR(255)," +
                    "secuSocialMedecin VARCHAR(255)," +
                    "salaire DOUBLE," +
                    "autorisation boolean," +
                    ")";
            statement.executeUpdate(createMedecinTable);

            String createPaiementTable = "CREATE TABLE Paiement (" +
                    "id BIGINT PRIMARY KEY AUTO_INCREMENT," +
                    "idVisite BIGINT PRIMARY KEY " +
                    "numeroCarte VARCHAR(255)," +
                    "dateExpiration DATE," +
                    "cryptogramme INT" +
                    ")";
            statement.executeUpdate(createPaiementTable);

            String createPatientTable = "CREATE TABLE Patient (" +
                    "id BIGINT PRIMARY KEY AUTO_INCREMENT," +
                    "nom VARCHAR(255)," +
                    "prenom VARCHAR(255)," +
                    "secuSocialPatient VARCHAR(255)," +
                    "typeAnalyse VARCHAR(255)," +
                    ")";
            statement.executeUpdate(createPatientTable);

            String createReservationTable = "CREATE TABLE Reservation (" +
                    "id BIGINT PRIMARY KEY AUTO_INCREMENT," +
                    "date DATE," +
                    "dateReservee Boolean" +
                    ")";
            statement.executeUpdate(createReservationTable);

            String createVisiteTable = "CREATE TABLE Visite (" +
                    "id BIGINT PRIMARY KEY AUTO_INCREMENT," +
                    "idPatient BIGINT primary key ," +
                    "nom String" +
                    "prenom String" +
                    "secuSocialPatient String" +
                    "typeAnalyse String" +
                    ")";
            statement.executeUpdate(createVisiteTable);


            System.out.println("Tables créées");

        } catch (SQLException e) {
            e.printStackTrace();
        }
        try (Connection connection = DriverManager.getConnection(URL, UTILISATEUR, MOT_DE_PASSE);
             Statement statement = connection.createStatement()) {

            String addForeignKeyEtudiant = "ALTER TABLE Etudiant " +
                    "ADD FOREIGN KEY (candidature_id) REFERENCES Candidature(id)";
            statement.executeUpdate(addForeignKeyEtudiant);

            // Ajout des clés étrangères pour la table Candidature
            String addForeignKeyCandidatureEtudiant = "ALTER TABLE Candidature " +
                    "ADD FOREIGN KEY (etudiant_id) REFERENCES Etudiant(id)";
            statement.executeUpdate(addForeignKeyCandidatureEtudiant);

            String addForeignKeyCandidatureBourse = "ALTER TABLE Candidature " +
                    "ADD FOREIGN KEY (bourse_id) REFERENCES Bourse(id)";
            statement.executeUpdate(addForeignKeyCandidatureBourse);

            System.out.println("Contraintes de clé étrangère ajoutées avec succès.");

        } catch (SQLException e) {
            e.printStackTrace();
        }

        closeConnexion(connexion);
    }

    public static Connection getConnexion() {
        Connection connexion = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connexion = DriverManager.getConnection(URL, UTILISATEUR, MOT_DE_PASSE);

            if (connexion != null) {
                System.out.println("Connexion etablie avec succes !");
            } else {
                System.out.println("Echec de la connexion.");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return connexion;
    }

    public static void closeConnexion(Connection connexion) {
        if (connexion != null) {
            try {
                connexion.close();
                System.out.println("Connexion fermee avec succes !");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


}