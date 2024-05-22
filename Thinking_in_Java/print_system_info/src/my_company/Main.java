package my_company;

import java.time.Instant;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.getProperties().list(System.out);
        System.out.println("\nHello, " + System.getProperty("user.name"));
        System.out.println("Today is " + Instant.now());
        System.out.println(
                System.getProperty("java.library.path")
        );
    }
}
