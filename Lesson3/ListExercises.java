/**Task 2: ListExercises
 ListExercises.java has 4 different methods for you to complete:

 sum: This method takes a list List<Integer> L and returns the total sum of the elements in that list.
 If the list is empty, the method should return 0.

 evens: This method takes a list List<Integer> L and returns a new list containing the even numbers of the given list.
 If there are no even elements, it should return an empty list.

 common: This method takes two lists List<Integer> L1, List<Integer> L2 and returns a new list containing
 the items present in both of the two given lists. If there are no common items, it should return an empty list.

 */

import java.util.ArrayList;
import java.util.List;

public class ListExercises {
    public static int sum(List<Integer> L) {
        int sum = 0;
        for (int i : L) {
            sum += i;
        }
        return sum;
    }

    public static List<Integer> evens(List<Integer> L) {
        List<Integer> evenL = new ArrayList<>();
        for (int i : L) {
            if(i % 2 == 0) {
                evenL.add(i);
            }
        }
        return evenL;
    }

    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        List<Integer> commonL = new ArrayList<>();
        for (int i : L1) {
            if (L2.contains(i)) {
                commonL.add(i);
            }
        }
        return commonL;
    }

    /*countOccurrencesOfC: This method takes a list and a character List<String> words, char c and
     returns the number of occurrences of the given character in a list of strings.
     If the character does not occur in any of the words, it should return 0.
     For this part, you can import ArrayList.*/
    public static int countOccurrencesOfC(List<String> words, char c) {
        int count = 0;
        for (String i : words) {
            char[] temp = i.toCharArray();
            for (char j : temp) {
                if (j == c) {
                    count ++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> L1 = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            L1.add(i);
        }
        List<Integer> L2 = new ArrayList<>();
        for (int i = 4; i < 20; i++) {
            L2.add(i);
        }
        System.out.println(common(L1,L2).toString());
    }
}
