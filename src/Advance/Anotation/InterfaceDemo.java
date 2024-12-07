package Advance.Anotation;


@FunctionalInterface
interface Student {
    int add(int i, int j);
}

public class InterfaceDemo {
    public static void main(String[] args) {
//            Student obj = new Student() {
//                public int add(int i, int j) {
//                    return i + j;
//                }
//            };

            Student obj = (i, j) -> i + j;

            int result = obj.add(1, 2);
            System.out.println(result);
    }
}