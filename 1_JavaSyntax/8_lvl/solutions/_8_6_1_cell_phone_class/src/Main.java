
public class Main {
    public static void main(String[] args) {
        CellPhone cellPhone1 = new CellPhone("Pineapple", "piPhone Z");
        CellPhone cellPhone2 = new CellPhone("Pineapple", "piPhone Z");
        if (cellPhone1.equals(cellPhone2)) {
            System.out.println("телефоны - одинаковые");
//        System.out.println("Hello world!");
        } else if (cellPhone1 != cellPhone2) {
            System.out.println("объекты - разные");
        }
    }
}
