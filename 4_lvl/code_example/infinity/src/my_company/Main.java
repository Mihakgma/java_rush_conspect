package my_company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Divide any digit on null gives:");
        System.out.println( 1.0 / 0.0 );
        System.out.println("Divide 0 on 0 gives:");
        System.out.println(0.0 / 0.0);
        double infinity = 1d / 0d;
        System.out.println("Divide infinity on infinity gives:");
        System.out.println(infinity / infinity);
        //Любая операция с NaN дает NaN.
        double a = 0.0 / 0.0;
        double d = a + infinity;
        System.out.println("double a = " + a);
        System.out.println("double d = " + d);
    }
}
