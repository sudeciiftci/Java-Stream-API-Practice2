import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingCartCalculator {

    public static void main(String[] args) {

        ArrayList<Integer> prices = new ArrayList<>(
                Arrays.asList(120, 250, 80, 400, 150, 300)
        );

        int total = prices.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println("Total: " + total);

        int mul = prices.stream()
                .reduce(1, (a, b) -> a * b);

        System.out.println("Multiplication: " + mul);

        int top = prices.stream()
                .filter(n -> n > 200)
                .reduce(0, (a, b) -> a + b);

        System.out.println("Total prices greater than 200: " + top);
    }
}