public class Main {
    public static void main(String[] args) {
        Apple apple1 = new Apple(0.3, "red");
        System.out.println(apple1);
        Person person = new Person();
        person.eat(apple1);
        System.out.println(apple1);
        Apple apple2 = new Apple();
        System.out.println(apple2);
        System.out.println();
        Peach peach1 = new Peach(0.35, "orange");
        System.out.println(peach1);
        person.eat(peach1);
        System.out.println(peach1);
    }
}
