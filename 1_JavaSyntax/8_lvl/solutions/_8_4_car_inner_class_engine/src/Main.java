public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.engine.checkIsRunning());
        car.engine.start();
        System.out.println("Engine started!");
        System.out.println(car.engine.checkIsRunning());
    }
}
