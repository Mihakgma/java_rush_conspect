//package com.javarush.task.pro.task08.task0812;

public class Pair {
    private int x;
    private int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("x=%d, y=%d", x, y);
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
    public void swap() {
        //напишите тут ваш код
//        int temp = this.x;
//        this.x = this.y;
//        this.y = temp;
        int temp = this.x ^ this.y;
        this.byteForm(temp);
        this.y = temp ^ this.y;
        this.byteForm(this.y);
        this.x = temp ^ this.y;
        this.byteForm(this.x);
    }
}