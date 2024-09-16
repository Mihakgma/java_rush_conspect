import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InputFile {
    private BufferedReader in;

    public InputFile(String fname) throws Exception {
        try {
            in = new BufferedReader(new FileReader(fname));
            // the next code part is able to express exceptions
        } catch (FileNotFoundException e) {
            System.out.println("Couldn't open " + fname);
            // no need to close it because it has not been opened
            throw e;
        } catch (Exception e) {
            // expressing other exceptions -> close file
            try {
                in.close();
            } catch (IOException e2) {
                System.out.println("error while processing in.close()");
            }
            throw e; // Rethrow
        }
    }

    public String getLine() {
        String s;
        try {
            s = in.readLine();
        } catch (IOException e) {
            throw new RuntimeException("Error while processing readLine()");
        }
        return s;
    }

    public void dispose() {
        try {
            in.close();
            System.out.println("dispose() has been processed successfully");
        } catch (IOException e2) {
            throw new RuntimeException("error while processing in.close()");
        }
    }
}
