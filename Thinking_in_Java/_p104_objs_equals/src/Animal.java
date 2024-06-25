public interface Animal {
    String nickName = "beastie";
    int minYearsOld = 0;
    double minKgWeight = 0.00001;


    default void says(){
        System.out.println("Animal says");
    }
    default void move() {
        System.out.println("Animal moves");
    }
    default void append_parazyte(Parasite parasite) {
    }
}
