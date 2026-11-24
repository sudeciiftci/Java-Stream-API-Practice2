import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilteredStudentScores {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(45, 80, 35, 90, 65, 25, 100);

        List<Integer> passedScores = numbers.stream()
                .filter(n -> n >= 50)
                .collect(Collectors.toList());

        System.out.println("Passed Scores: " + passedScores);

        List<Integer> updatedScores = numbers.stream()
                .filter(n -> n >= 50)
                .map(n -> n + 5)
                .collect(Collectors.toList());

        System.out.println("Updated Scores: " + updatedScores);
    }
}