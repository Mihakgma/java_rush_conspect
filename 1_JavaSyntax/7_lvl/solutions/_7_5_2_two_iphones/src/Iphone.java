public class Iphone {
    private String model;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }
    //напишите тут ваш код
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        else if (obj == null || !(obj instanceof Iphone)) {
            return false;
        }
        else if (this.model == ((Iphone) obj).model
                && this.color == ((Iphone) obj).color
                && this.price == ((Iphone) obj).price) {
            return true;
        }
        return false;
    }
}
