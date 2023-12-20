package models;
import java.time.LocalDate;

public class Reservation {
    private int idReservation;

    private LocalDate date;
    private boolean dateReservee;



    public Reservation(LocalDate date, boolean dateReservee) {
        this.date = date;
        this.dateReservee = dateReservee;
    }

    public LocalDate getDate() {
        return date;
    }

    public boolean isDateReservee() {
        return dateReservee;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setDateReservee(boolean dateReservee) {
        this.dateReservee = dateReservee;
    }


}