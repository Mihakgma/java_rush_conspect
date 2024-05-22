package my_company;
import java.util.Arrays;

public class Main {
    private final String[] students = new String[30];

    public void addStudent(String student) {
        int i = 0;
        for (; i < students.length; i++) {
            if (students[i] == null) {
                break;
            }
        }
        students[i] = student;
    }

    public void printStudents() {
        for (String student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        Main obj = new Main();
        obj.addStudent("Максим Федоренко");
        obj.addStudent("Олег Кесарчук");
        obj.printStudents();
    }
}
