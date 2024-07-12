public interface Flyable {
    default void fly(){
        BasicAnimal.print("This animal can fly! Fly into the sky...");
    }
}
