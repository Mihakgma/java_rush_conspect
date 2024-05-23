public class Main {
    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 90;
        t2.level = 470;
        System.out.println("1: t1.level: " + t1.level + " , t2.level: " + t2.level);
        System.out.println("1: t1.hashCode: " + t1.hashCode() + " , t2.hashCode: " + t2.hashCode());
        t1 = t2;
        System.out.println("2: t1.level: " + t1.level + " , t2.level: " + t2.level);
        System.out.println("2: t1.hashCode: " + t1.hashCode() + " , t2.hashCode: " + t2.hashCode());
        t1.level = 270;
        System.out.println("3: t1.level: " + t1.level + " , t2.level: " + t2.level);
        System.out.println("3: t1.hashCode: " + t1.hashCode() + " , t2.hashCode: " + t2.hashCode());
//        System.out.println("Hello world!");
    }
}
