import java.util.HashMap;
import java.util.Map;

class Main {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // Key: number, Value: index
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // Needed number to form the sum
            
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i }; // Return indices
            }
            
            map.put(nums[i], i); // Store the number and its index
        }
        
        throw new IllegalArgumentException("No two sum solution"); // Handle invalid cases
    }

    // ✅ Main Function (To Run the Code)
    public static void main(String[] args) {
        Main sol = new Main(); // Object Creation
        
        int[] nums = {2, 7, 11, 15}; // Input Array
        int target = 9; // Target Sum
        
        // Two Sum Function Call
        int[] result = sol.twoSum(nums, target);
        
        // Output the Result
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }


}
