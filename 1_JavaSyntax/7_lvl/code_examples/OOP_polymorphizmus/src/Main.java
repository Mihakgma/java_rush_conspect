public class Main {
    public static void main(String[] args) {
        Insect insect = new Insect(6, 4);
        Butterfly butterfly = new Butterfly(6, 4, "white");
        Mantis mantis = new Mantis(6, 4, false);
        Mantis mantis1 = new Mantis();
        insect.feed();
        butterfly.feed();
        mantis.move();

//        System.out.println("Hello world!");
    }
}
