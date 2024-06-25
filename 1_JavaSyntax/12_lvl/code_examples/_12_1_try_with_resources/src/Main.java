import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    static String path = "e:\\projects\\log.txt";
    public static void main(String[] args) throws IOException {
        FileOutputStream output = null;

        try {
            output = new FileOutputStream(path);
            output.write("Donkey kong is alright again. Донт ворри би хэппи :-)".getBytes());
        } catch (FileNotFoundException e) {
            System.out.println(e);
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (output != null) {
                output.close();
            }
        }

//        System.out.println();
    }
}
