package ArrayList;

import java.util.ArrayList;

public class MostFrequentNumAfterKey {

    public static int mostFrequent(ArrayList<Integer> nums, int key) {
        int[] result = new int[1000];  // Create an array to store the frequency count of each number

        // Iterate through the nums list
        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) == key) {
                result[nums.get(i + 1) - 1]++;  // Increment the count for the next number after the key
            }
        }

        int max = Integer.MIN_VALUE;  // Initialize the maximum frequency to the lowest possible value
        int ans = 0;  // Initialize the answer (most frequent number) to 0

        // Iterate through the result array
        for (int i = 0; i < 1000; i++) {
            if (result[i] > max) {
                max = result[i];  // Update the maximum frequency
                ans = i + 1;  // Update the most frequent number
            }
        }

        return ans;  // Return the most frequent number
    }

        public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(200);
        list.add(1);
        list.add(200);
        list.add(100);

        System.out.println(mostFrequent(list, 1));
    }
}
