public class Peeler {
    static Fruit peel(Fruit fruit) {
        System.out.println("Peeling a " + fruit.getClass().getName());
        return fruit;
    }
}
