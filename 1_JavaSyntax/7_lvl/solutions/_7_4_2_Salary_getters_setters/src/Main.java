public class Main {
    public static int[] newSalary = {3, 1001, 900, 20000};

    public static void main(String[] args) {
        Programmer proger = new Programmer();
        Programmer proger2 = new Programmer();
        System.out.println(proger.equals(proger2));
        System.out.println(proger == proger2);
        System.out.println(proger.getSalary());
        for (int i = 0; i < newSalary.length; i ++) {
            int salary = newSalary[i];
            Programmer obj = new Programmer();
            obj.setSalary(salary);
            System.out.println("New salary of <" + Programmer.name + "> equals to <" + obj.getSalary() + ">");
        }
//        System.out.println("Hello world!");
    }
}