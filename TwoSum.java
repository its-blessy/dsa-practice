import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the numbers we've seen and their array indices
        // Key: The number itself, Value: The index of that number in the array
        Map<Integer, Integer> numMap = new HashMap<>();

        // Loop through each element in the input array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the required value (complement) needed to reach the target
            int complement = target - nums[i];

            // Check if this complement already exists in our HashMap
            if (numMap.containsKey(complement)) {
                // If found, return the index of the complement and the current index
                return new int[] { numMap.get(complement), i };
            }

            // If not found, add the current number and its index to the map
            numMap.put(nums[i], i);
        }

        // Return an empty array or throw an exception if no solution exists
        // (LeetCode guarantees exactly one solution, so this line is a fallback)
        return new int[] {};
    }

    public static void main(String[] args) {
        // Example test case
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        // Print the result indices: [0, 1] because nums[0] + nums[1] == 9
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
