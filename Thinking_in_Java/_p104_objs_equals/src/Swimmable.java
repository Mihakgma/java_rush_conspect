public interface Swimmable {
    double SWIM_SPEED_MIN = 0.001;
    public default void swim() {
        BasicAnimal.print("This animal can swim!!!");
    }
}
