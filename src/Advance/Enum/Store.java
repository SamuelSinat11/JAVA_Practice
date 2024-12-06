package Advance.Enum;

enum Laptop{
    MacBook(3000), MSI(1000), ASUS(600), SURFACE(350), DELL(600);
    private int price;

    Laptop(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class Store {
    public static void main(String[] args) {
//        Laptop laptop = Laptop.MacBook;
//        System.out.println(laptop.getPrice());

        for (Laptop lap : Laptop.values()) {
            System.out.println(lap + ":" + lap.getPrice());
        }
    }
}
