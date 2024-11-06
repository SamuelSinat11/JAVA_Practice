package OOP.Reservation;


import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        ResortReservation resortReservation = new ResortReservation(1,"samuel", 11-06-24, 101);
        resortReservation.checkReservationStatus();
        System.out.println();

        resortReservation.modifyReservation("Samuel", LocalDate.ofEpochDay(11-06-24), 101);
        resortReservation.checkReservationStatus();
        System.out.println();
    }
}
