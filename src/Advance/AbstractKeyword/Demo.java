class Car {
    public void drive() {
        System.out.println("Testing Drive");
}

    public void playMusic() {
        System.out.println("Playing Music");
    }
}

class BMW extends Car {

    public void enchine() {
        System.out.println("Enching BMW");
    }
}


public class demo {
    public void main(String args[]) {
        Car obj = new Car();
        obj.drive();
        obj.playMusic();

        BMW obj2 = new BMW();
        obj2.enchine();
        obj.playMusic();
    }
}

public void main() {
}
