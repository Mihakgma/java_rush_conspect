/*
At first applying constructor of the basic class
and then constructors of the offspring classes...
Check the script output.

* Output:
*
* Meal()
  Lunch()
  PortableLunch()
  Bread()
  Cheese()
  Lettuce()
  Sandwich()

  Why?
  Because during creating new class object it's necessary to know
  whether the methods and attributes are already created to avoid errors...

* */

public class Main {
    public static void main(String[] args) {
        new Sandwich();
    }
    static void print(Object obj) {
        System.out.println(obj);
    }
}
