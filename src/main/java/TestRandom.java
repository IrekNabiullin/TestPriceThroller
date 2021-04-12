import java.util.Random;

public class TestRandom {
    private static Random random = new Random();

    static int generateRandom(int n) {
        return Math.abs(random.nextInt()) % n;
    }
}