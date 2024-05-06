public class Main {
    public String name = "Amigo";
    public static String position = "Java developer";
    public static int salary = 10_000;

    public static void setPosition(String position) {
        Main.position = position;
    }

    public static void setSalary(int salary) {
        Main.salary = salary;
    }

    public static void main(String[] args) {
        Main.setPosition("Python developer");
        Main.setSalary(70_000);
    }
}
