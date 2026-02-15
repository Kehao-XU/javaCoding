import java.util.*;

public class MapExercises {
    /*letterToNum: This method returns a map from every lower case letter to the number corresponding to
    its ordering in the alphabet, where ‘a’ corresponds to 1 and ‘z’ corresponds to 26.*/
    public static Map<Character, Integer> letterToNum() {
        Map<Character, Integer> letterMap = new TreeMap<>();
        for (int i = 0; i < 26; i++) {
            letterMap.put((char)('a' + i), i + 1);
        }
        return letterMap;
    }

    /*squares: This method takes a list List<Integer> nums and returns a map from the integers
    in the list to their squares.
    If the given list is empty, it should return an empty map.*/
    public static Map<Integer, Integer> squares(List<Integer> nums) {
        Map<Integer, Integer> squareMap = new TreeMap<>();
        for (int num : nums) {
            squareMap.put(num, num*num);
        }
        return squareMap;
    }

    /*countWords: This method takes a list List<String> words and returns a map from words
    in the list to the number of times they appear. If the given list is empty, it should return an empty map.
    For this part, you can import TreeMap.*/
    public static Map<String, Integer> countWords(List<String> words) {
        Map<String, Integer> countWordsMap = new TreeMap<>();
        for (String word : words) {
            countWordsMap.put(word, countWordsMap.getOrDefault(word, 0) + 1);
        }
        return countWordsMap;
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Hello", "Hello", "Java", "World");
        System.out.println(countWords(words));
    }
}
