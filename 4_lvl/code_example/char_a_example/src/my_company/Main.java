package my_company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        char a1 = 'A';
        char a2 = 65;
        char a3 = 0x41;
        char a4 = 0x0041;
        char a5 = '\u0041';
        int aSum = a1 + a2 + a3 + a4 + a5;
        System.out.println(aSum);
        System.out.println(aSum / 5);
        System.out.println(a1);
        System.out.println(a1 == a5);
        char aChars[] = {a1, a2, a3, a4, a5};
        System.out.println(aChars);
        int aInts[] = {a1, a2, a3, a4, a5};
        System.out.println(aInts.toString());
        for (int i = 0; i < aInts.length; i++){
            System.out.println((i+1)+"-ый элемент int-множества (представления char) равен:");
            System.out.println(aInts[i]);
        }
    }
}
