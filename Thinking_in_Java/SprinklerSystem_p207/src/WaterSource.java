import java.sql.SQLOutput;

public class WaterSource {
    private String s;
    WaterSource() {
        System.out.println("WaterSource()");
        s = "constructed";
    }

    @Override
    public String toString() {
        return s;
    }
}
