package my_company;

import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Integer[] array = new Integer[5];
        fillArray(array, 3);
        System.out.println(Arrays.toString(array));
    }
    public static void fillArray(Integer[] array, int value){
        //напишите тут ваш код
        for (int i = 0; i < array.length; i++) {
            array[i] = value;
        }
    }
}
