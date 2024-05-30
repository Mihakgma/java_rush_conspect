public class Person {
    public void eat(Fruit fruit) {
        Fruit peeled = fruit.getPeeled();
        System.out.println("Yummy...");
        peeled.getEaten();
    }
}
