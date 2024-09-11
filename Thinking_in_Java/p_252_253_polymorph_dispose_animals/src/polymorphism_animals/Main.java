package polymorphism_animals;

public class Main {
    static int recipientCounter = 5;
    public static void main(String[] args) {
        Frog frog = new Frog();
        Frog frog1 = new Frog();
        print("\nByeeeeee!\n");
        frog.dispose();
        frog1.dispose();
        print("\n Trying to compose and finalize inside the other object shared obj");
        Characteristic heart = new Characteristic("young and strong heart");
        Recipient[] recipients = new Recipient[recipientCounter];
        for (int i = 0; i < recipientCounter; i++) {
            recipients[i] = new Recipient(heart);
        }
        for (Recipient r: recipients) {
            r.dispose();
        }
//        print("characteristics created overall: " + Characteristic.);
    }

    static void print(Object obj) {
        System.out.println(obj);
    }
}
