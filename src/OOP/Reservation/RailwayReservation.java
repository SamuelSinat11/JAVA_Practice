package OOP.Reservation;

import java.time.LocalDate;

public class RailwayReservation extends Reservation {

    private int seatNumber;
    public RailwayReservation(int id, String customerName, int Date, int seatNumber) {
        super(id, customerName, LocalDate.ofEpochDay(Date));
        this.seatNumber = seatNumber;
    }

    @Override
    public void checkReservationStatus() {
        super.checkReservationStatus();
        System.out.println("Seat Number" + seatNumber);
    }

    public void modifyReservation(String newCustomerName, LocalDate newDate, int newSeatNumber) {
        super.modifyReservation(newCustomerName,newDate);
        this.seatNumber = newSeatNumber;
        System.out.println("Seat Number updated successfully");
    }

    public int getSeatNumber() {
        return seatNumber;
    }

}
