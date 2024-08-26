import java.util.Random;

public class TestClass1 {
    public static void main(String[] args) {
        String[] randomStrings = {
                "Hello, World!",
                "Java is awesome!",
                "Random string here!",
                "Code like a pro!",
                "Keep learning every day!"
        };

        // Generate a random index between 0 and the length of the array
        Random random = new Random();
        int randomIndex = random.nextInt(randomStrings.length);

        // Print out the random string
        System.out.println(randomStrings[randomIndex]);
    }
}