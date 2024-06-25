public class Bath {
    private String
    s1 = "joyful",
    s2 = "joyful",
    s3, s4;
    private Soap castille;
    private int i;
    private float toy;
    public Bath() {
        Main.print("В конструкторе Bath()");
        s3 = "Радостный";
        toy = 3.14f;
        castille = new Soap();
    }
    // Инициазиция экземпляра
    { i = 47; }

    @Override
    public String toString() {
        if (s4 == null) {
            s4 = "joyeux"; // 4-ый способ
        }
        return
            "s1 = " + s1 + "\n" +
            "s2 = " + s2 + "\n" +
            "s3 = " + s3 + "\n" +
            "s4 = " + s4 + "\n" +
            "i = " + i + "\n" +
            "toy = " + toy + "\n" +
            "castille = " + castille;
    }
}
