package Contructor;

public class Car {
    private String name;
    private String Model;
    private int year;

    public Car(String name, String Model, int year) {
        this.name = (name == null || name.isEmpty()) ? "Unknown" : name;
        this.Model = (Model == null || Model.isEmpty()) ? "Unknown" : Model;
        this.year = year;
    }

    public static void main (String[] args) {

        Car carList = new Car("TOYOTA", "SPORT", 2030);
        System.out.println("Name:" + carList.name);
        System.out.println("Model:" + carList.Model);
        System.out.println("Year:" + carList.year);
    }
}
