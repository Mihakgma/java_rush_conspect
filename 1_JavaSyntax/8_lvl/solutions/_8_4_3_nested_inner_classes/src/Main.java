/*
https://stackoverflow.com/questions/70324/java-inner-class-and-static-nested-class
 */

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        Outer.Nested nested = new Outer.Nested();
//        System.out.println("Hello world!");
    }
}
