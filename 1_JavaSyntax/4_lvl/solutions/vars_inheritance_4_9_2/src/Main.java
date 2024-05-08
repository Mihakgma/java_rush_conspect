public class Main {
    public static void main(String[] args) {
        System.out.println("Hello classes attributes!");
        ElectricCar electricCar = new ElectricCar();
        electricCar.electricEnginePower = 300;
        electricCar.maxSpeed = 455;
        electricCar.weight = 1900;
        electricCar.wheelCount = 4;
        System.out.println(electricCar);
        System.out.println("engine power = " + electricCar.electricEnginePower);
        System.out.println("max speed is " + electricCar.maxSpeed);
        System.out.println("weight is " + electricCar.weight);
        System.out.println("number of wheels is " + electricCar.wheelCount);
    }
}