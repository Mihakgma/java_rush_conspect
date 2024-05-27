/**
Surprise! The overflowing is possible in Java
*/

public class Main {
    public static void main(String[] args) {
        int big = Integer.MAX_VALUE;
        System.out.println("Max value = " + big);
        int bigger = big + 4;
        int moreBigger = big * 999;
        System.out.println("Bigger = " + bigger);
        System.out.println("More bigger = " + moreBigger);
    }
}
