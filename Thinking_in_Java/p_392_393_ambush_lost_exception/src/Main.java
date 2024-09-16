public class Main {
    public static void main(String[] args) {
        try {
            Main main = new Main();
            try {
                main.f();
            } finally {
                main.dispose();
                return;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void f() throws VeryImportantException {
        throw new VeryImportantException();
    }

    static void dispose() throws HoHumException {
        throw new HoHumException();
    }
}
