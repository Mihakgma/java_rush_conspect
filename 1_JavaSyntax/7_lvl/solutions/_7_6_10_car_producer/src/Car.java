public class Car {
    private String model;
    private int year;
    private String color;

    public void initialize(String mdl, int yr, String clr) {
        setModel(mdl);
        setYear(yr);
        setColor(clr);
    }

    public void setColor(String color) {
        if (color != "") {
            this.color = color;
        }
    }

    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        }
    }

    public void setModel(String model) {
        if (model != "") {
            this.model = model;
        }
    }
}
