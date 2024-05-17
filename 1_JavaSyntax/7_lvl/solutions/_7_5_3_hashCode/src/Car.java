public class Car {
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
    public int hashCode() {
        int hshCode = this.model.hashCode() + this.year;
        return hshCode;
    }
}
