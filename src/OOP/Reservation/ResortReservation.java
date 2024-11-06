package OOP.Reservation;


import java.time.LocalDate;

public class ResortReservation extends Reservation {
    private int roomNumber;
    
    public ResortReservation(int id, String customerName, int Date, int roomNumber) {
        super(id, customerName, LocalDate.ofEpochDay(Date));
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    @Override
    public void checkReservationStatus() {
        super.checkReservationStatus();
        System.out.println("Room Number:" + roomNumber);
    }

    public void modifyReservation(String newCustomerName, LocalDate newDate, int newRoomNumber) {
        super.modifyReservation(newCustomerName, newDate);
        this.roomNumber = newRoomNumber;
        System.out.println("Room Number update sucessfully");
    }



}
