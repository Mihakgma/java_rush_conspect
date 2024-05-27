public class Main {
    public static void main(String[] args) {
        compareStrings("1", "2");
        compareStrings("333", "333");
        compareStrings("Good", "Badly");
    }
    public static void print(Object var) {
        System.out.println(var);
    }
    public static void compareStrings(String var1, String var2) {
        print("For strings (variables): " + var1 + " and " + var2);
        print("Having hash codes: " + var1.hashCode() + " and " + var2.hashCode());
        print("Bytes for variables: " + var1.getBytes() + " and " + var2.getBytes() + " :\n");

        print("var1 > var2 = " + (var1.hashCode() > var2.hashCode()));
        print("var1 >= var2 = " + (var1.hashCode() >= var2.hashCode()));
        print("var1 & var2 = " + (var1.hashCode() & var2.hashCode()));
        print("var1 == var2 = " + (var1 == var2));
        print("var1 equals var2 = " + (var1.equals(var2)));
        print("var1 != var2 = " + (var1 != var2));
        print("var1 not equals var2 = " + !(var1.equals(var2)) + "\n");
    }
}
