public class Main {
    public static double sin(double a) {
        //напишите тут ваш код
        return Math.sin(Math.toRadians(a));
    }

    public static double cos(double a) {
        //напишите тут ваш код
        return Math.cos(Math.toRadians(a));
    }

    public static double tan(double a) {
        //напишите тут ваш код
        return Math.tan(Math.toRadians(a));
    }
    public static void main(String[] args) {
        System.out.println(sin(45));
        System.out.println(cos(45));
        System.out.println(tan(45));
        System.out.println("Hello world!");
    }
}