public class Main {
    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("X", "Black", 999);
        Iphone iphone2 = new Iphone("X", "Black", 999);
        Iphone copy = iphone2;

        System.out.println(iphone1.equals(iphone2)); //true
        System.out.println(iphone1 == iphone2);      //false
        System.out.println(iphone2 == copy);         //true
        System.out.println(iphone2.equals(copy));    //true
//        System.out.println("Hello world!");
    }
}
