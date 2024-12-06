package Advance.AbstractKeyword;

class Car {
    public void drive() {
        System.out.println("Testing Drive");
}

    public void playMusic() {
        System.out.println("Playing Music");
    }
}

public class Demo {
    public static  void main(String args[]) {
        Car obj = new Car();
        obj.drive();
        obj.playMusic();
    }
}
