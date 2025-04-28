package utills;

import java.util.Random;

public class RandomValue {

    private static final Random RANDOM = new Random();

    public static String generateRandomDigits(int capacity) {
        StringBuilder digits = new StringBuilder(capacity);

        for (int i = 0; i < 4; i++) {
            digits.append(RANDOM.nextInt(10));
        }

        return digits.toString();
    }
}
