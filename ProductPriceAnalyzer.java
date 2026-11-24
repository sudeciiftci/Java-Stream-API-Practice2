public static void main(String[] args) {

    ArrayList<Integer> prices = new ArrayList<>(
            Arrays.asList(250, 120, 450, 300, 180, 600, 90, 350, 450, 200)
    );

    System.out.println("Cheapest Product:");
    int min = prices.stream()
            .min(Comparator.naturalOrder())
            .orElse(0);
    System.out.println(min);

    System.out.println("\nMost Expensive Product:");
    int max = prices.stream()
            .max(Comparator.naturalOrder())
            .orElse(0);
    System.out.println(max);

    System.out.println("\nMost Expensive Product Above 200:");
    int result = prices.stream()
            .filter(n -> n > 200)
            .max(Comparator.naturalOrder())
            .orElse(0);
    System.out.println(result);
}