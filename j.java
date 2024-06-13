import java.util.*;

public class RandomExample {

    public static void main(String[] args) {
        // Generate a random list of integers
        List<Integer> randomList = generateRandomList(10);
        System.out.println("Randomly generated list: " + randomList);

        // Find the maximum value in the list
        int max = findMax(randomList);
        System.out.println("Maximum value in the list: " + max);
    }

    // Method to generate a list of random integers
    public static List<Integer> generateRandomList(int size) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(100) + 1); // Generates random integers between 1 and 100
        }
        return list;
    }

    // Method to find the maximum value in a list of integers
    public static int findMax(List<Integer> list) {
        int max = Integer.MIN_VALUE;
        for (int num : list) {
            if (num > max) {
                max = num;
            }
        }
      return max;
}
}
