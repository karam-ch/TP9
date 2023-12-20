package models;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseManager {
    private static final String URL = "jdbc:mysql://localhost:3306/jdbc";
    private static final String USER = "root";
    private static final String PASSWORD = "root";


    public void addVisite(Visite visiteParam) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String query = "INSERT INTO Visite (idPatient, nom, prenom, secuSocialPatient, typeAnalyse) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setInt(1, visiteParam.getIdPatient());
                preparedStatement.setString(2, visiteParam.getNom());
                preparedStatement.setString(3, visiteParam.getPrenom());
                preparedStatement.setString(4, visiteParam.getSecuSocialPatient());
                preparedStatement.setString(4, visiteParam.getTypeAnalyse());
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addReservation(Reservation reservationParam) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String query = "INSERT INTO Reservation (date, dateReservee) VALUES (?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setDate(1, java.sql.Date.valueOf(reservationParam.getDate()));
                preparedStatement.setBoolean(2, reservationParam.isDateReservee());
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addPatient(Patient patientParam) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String query = "INSERT INTO Patient (nom, prenom, secuSocialPatient, typeAnalyse) VALUES (?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, patientParam.getNom());
                preparedStatement.setString(2, patientParam.getPrenom());
                preparedStatement.setString(3, patientParam.getSecuSocialPatient());
                preparedStatement.setString(4, patientParam.getTypeAnalyse());
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addPaiement(Paiement paiementParam) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String query = "INSERT INTO Paiement (idVisite, numeroCarte, dateExpiration, cryptogramme) VALUES (?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setInt(1, paiementParam.getIdVisite());
                preparedStatement.setString(2, paiementParam.getNumeroCarte());
                preparedStatement.setDate(3, java.sql.Date.valueOf(paiementParam.getDateExpiration()));
                preparedStatement.setInt(4, paiementParam.getCryptogramme());
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addMedecin(Medecin medecinParam) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String query = "INSERT INTO Medecin (nom, prenom, secuSocialMedecin, salaire, authorisation) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, medecinParam.getNom());
                preparedStatement.setString(2, medecinParam.getPrenom());
                preparedStatement.setString(3, medecinParam.getSecuSocialMedecin());
                preparedStatement.setDouble(4, medecinParam.getSalaire());
                preparedStatement.setBoolean(4, medecinParam.isAuthorisation());
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addAnalyse(Analyse analyseParam) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String query = "INSERT INTO Analyse (hemogramme, groupeSanguin, vitesseSédimentation) VALUES (?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setBoolean(1, analyseParam.isHemogramme());
                preparedStatement.setString(2, analyseParam.getGroupeSanguin());
                preparedStatement.setInt(3, analyseParam.getVitesseSédimentation());

                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
