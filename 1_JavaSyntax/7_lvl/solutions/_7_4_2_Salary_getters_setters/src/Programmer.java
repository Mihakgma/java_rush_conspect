public class Programmer {
    private int salary = 1000;
    public static String name = "John";
    public Programmer() {
        this.salary = salary;
    }
    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        if ((salary / this.salary) > 10) {
            System.out.println("Great Job, " + this.name + " !");
        } else System.out.println("You could do it better, " + this.name + " !");
        if (salary > this.salary) {
            this.salary = salary;
        }
    }
}
