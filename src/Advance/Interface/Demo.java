package Advance.Interface;

abstract class Computer {
    public Computer code;

    public abstract void code();
}

class Laptop extends Computer {
    public void code () {
        System.out.println("code, compile, run");
    }
}

class Desktop extends Computer {
    public void code(){
        System.out.println(" Desk -> code, run : Faster than Laptop");
    }
}

class Developer {
    public void devApp(Computer lap)
    {
        lap.code();
    }
}

public class Demo {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer developer = new Developer();
        lap.code();
        desk.code();
        developer.devApp(lap.code);
    }
}
