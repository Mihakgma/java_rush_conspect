public class Main {
    public static void main(String[] args) {
        CustomStringArrayList arrayList = new CustomStringArrayList();
        for(int i = 0; i < 25; i++) {
            arrayList.add("count" + i);
        }
        arrayList.printElements();
//        System.out.println("Hello world!");
    }
}
