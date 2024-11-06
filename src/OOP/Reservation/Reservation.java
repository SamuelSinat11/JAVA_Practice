package OOP.Reservation;

import java.time.LocalDate;

public abstract class Reservation {
    private int id;
    private String customerName;
    private LocalDate Date;

    public Reservation(int id, String customerName, LocalDate Date) {
        this.id = id;
        this.customerName = customerName;
        this.Date = Date;
    }

    public void checkReservation() {
        System.out.println("Reservation ID: " + id);
        System.out.println("Customer Name:" + customerName);
        System.out.println("Date: " + Date);
        System.out.println("Status: Confirmed");
    }

    public void modifyReservation( String newCustomerName, LocalDate newDate) {
        this.customerName = newCustomerName;
        this.Date = newDate;
        System.out.println("Reservation modified successfully");
    }

    public int getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void checkReservationStatus() {
    }
}
