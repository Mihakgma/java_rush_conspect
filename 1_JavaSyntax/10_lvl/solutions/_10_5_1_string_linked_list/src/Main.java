/*
* Linked list algorith realization for String class elements (nodes values)
* */
public class Main {
    public static void main(String[] args) {
        StringLinkedList stringLinkedList = new StringLinkedList();
        stringLinkedList.add("1");
        stringLinkedList.add("2");
        stringLinkedList.add("3");
        stringLinkedList.add("4");
        stringLinkedList.add("5");
        stringLinkedList.add("6");
        stringLinkedList.add("7");
        stringLinkedList.add("8");
        stringLinkedList.add("9");
        stringLinkedList.printAll();
        System.out.println(stringLinkedList.get(4));
        System.out.println(stringLinkedList.get(100));
    }
}
