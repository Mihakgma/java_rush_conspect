public class Main {
    public static void main(String[] args) {
        int i = 0;
        outer:
        for (; i < 10; i++) {
            print("i = " + i);
            if (i == 2) {
                print("continue");
                continue;
            }
            if (i == 3) {
                print("break");
                i++;
                break;
            }
            if (i == 7) {
                print("continue outer");
                i++;
                continue outer;
            }
            if (i == 8) {
                print("break outer");
                break outer;
            }

        }
//        System.out.println("Hello world!");
    }
    public static void print(Object object) {
        System.out.println(object);
    }
}