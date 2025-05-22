import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 2, 10, 3, 4, 4, 1, 1, 5};
        String[] words = {"Один", "Два", "Три", "Один", "Два"};

        Map<Integer, Integer> countOfNums = count(nums);
        countOfNums.forEach((k, v) -> System.out.println(k + ": " + v));

        Map<String, Integer> countOfWords = count(words);
        countOfWords.forEach((k, v) -> System.out.println(k + ": " + v));
    }

    private static <T> Map<T, Integer> count(T[] array) {
        Map<T, Integer> countOfElements = new HashMap<>();

//        for (T element : array) {
//            countOfElements.put(element, countOfElements.getOrDefault(element, 0) + 1);
//        }

        for (T element : array) {
            countOfElements.merge(element, 1, Integer::sum);
        }

        return countOfElements;
    }
}