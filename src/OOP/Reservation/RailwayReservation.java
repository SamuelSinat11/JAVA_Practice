package OOP.Reservation;

import java.time.LocalDate;

public class RailwayReservation extends Reservation {

    private Integer seatNumber;
    public RailwayReservation(int id, String customerName, LocalDate Date, Integer seatNumber) {
        super(id, customerName, Date);
        this.seatNumber = seatNumber;
    }


}
