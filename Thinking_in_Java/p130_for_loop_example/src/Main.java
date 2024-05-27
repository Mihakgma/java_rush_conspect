/**
@author Mikhail T.
 For loop example to print
all ASCII symbols in lower case
*/

public class Main {
    /*
    * Prints the ASCII symbols in lower case and their int value
    */
    public static void main(String[] args) {
        for (char i = 0; i < 128; i++) {
//            print("Char value is: " + (int)i + ", Symbol = " + i);
            if (Character.isLowerCase(i)) {
                print("Char value is: " + (int)i + ", Symbol = " + i);
            }
        }
//        print("Hello world!");
    }

    /*
    * This method provides short way to print any object type in the current module
    * */
    static void print(Object obj) {
        System.out.println(obj);
    }
}
