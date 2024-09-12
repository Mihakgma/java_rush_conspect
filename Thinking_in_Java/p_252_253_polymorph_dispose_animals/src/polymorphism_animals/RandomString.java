package polymorphism_animals;

import java.util.UUID;

public class RandomString {
    static int rounds = 3;

    public static String generateString() {
        StringBuilder uuid = new StringBuilder();
        for (int i = 0; i < rounds; i++) {
            String uuidTemp = UUID.randomUUID().toString().replace("-", "");
            uuid.append(uuidTemp);
        }
        return uuid.toString();
    }
}
