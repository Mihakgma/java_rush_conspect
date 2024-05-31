public class Main {
    public static void main(String[] args) {
        Tank tank1 = new Tank();
        tank1.fullTank();
//        tank1.finalize();
        System.gc();
        print(tank1);
        Tank tank2 = new Tank();
        tank2.fullTank();
        tank2.emptyTank();
        tank2.finalize();
        print(tank2);
        tank2.fullTank();
    }
    static void print(Object obj) {
        System.out.println(obj);
    }
}
