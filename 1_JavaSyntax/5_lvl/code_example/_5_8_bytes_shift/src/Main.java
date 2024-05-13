public class Main {
    public static void main(String[] args) {
        int tst_Digit = ~1;
        System.out.println(Integer.toBinaryString(tst_Digit));
        System.out.println(tst_Digit);
        int dgt = 7;
        System.out.println("Positive digits:");
        byteForm(dgt << 2);
        System.out.println(Integer.toBinaryString(dgt));
        byteForm(dgt >> 12);
        byteForm(dgt >>> 12);

        int dgtNgtive = -7;
        System.out.println("Negative digits:");
        System.out.println(Integer.toBinaryString(dgtNgtive));
//        byteForm(dgtNgtive << 2);
//        byteForm(dgtNgtive >> 12);
        byteForm(dgtNgtive >>> 12);
//        System.out.println("Hello world!");
    }
    public static void byteForm(int number) {
        int module = (int) Math.pow(2, 30);
        while (module > number) {
            module >>= 1;
        }
        System.out.print("The Number " + number + " in bit presentation: ");
        while (module > 0) {
            System.out.print(number / module > 0 ? 1 : 0);
            number %= module;
            module >>= 1;
        }
        System.out.println();
    }
}
