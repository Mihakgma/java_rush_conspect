package my_company;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Jphone jphone1 = new Jphone(128);
        Jphone jphone2 = new Jphone(12);
        System.out.println(jphone1.getMemory());
        System.out.println(jphone2.getMemory());

        LocalDate date = LocalDate.now();
        DayOfWeek day = date.getDayOfWeek();
        switch (day)
        {
            case MONDAY:
                System.out.println("Понедельник");
                break;
            case TUESDAY:
                System.out.println("Вторник");
                break;
            case WEDNESDAY:
                System.out.println("Среда");
                break;
            case THURSDAY:
                System.out.println("Четверг");
                break;
            case FRIDAY:
                System.out.println("Пятница");
                break;
            case SATURDAY:
                System.out.println("Суббота");
                break;
            case SUNDAY:
                System.out.println("Воскресенье");
                break;
        }
    }
}
