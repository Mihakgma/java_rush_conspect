package polymorphism_animals;

public class Main {
    public static void main(String[] args) {
        Frog frog = new Frog();
        print("Bye!");
        frog.dispose();
    }

    static void print(Object obj) {
        System.out.println(obj);
    }
}
