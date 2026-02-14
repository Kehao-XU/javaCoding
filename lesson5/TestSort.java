package lesson5;

public class TestSort {
   /** Tests the sort method of the Sort class. */
   public static void testSort() {
       String[] input = {"cows", "dwell", "above", "clouds"};
       String[] expected = {"above", "clouds", "cows", "dwell"};
       Sort.sort(input);
   }

   public static void main(String[] args) {
       testSort();
   }
}
