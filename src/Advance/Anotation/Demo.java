package Advance.Anotation;

class A  {
    public void showData() {
        System.out.println("A");
    }
}

class B extends A {
    @Override
    public void showData() {
        System.out.println("B");
    }
}



public class Demo {
    public static void main(String[] args) {
        B b = new B();
        b.showData();
    }
}
