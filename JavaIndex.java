
 class ArraySoltuion{

    public int[] twoSum(int[] nums, int target) {
        // Loop through the array from the first element to the second-to-last element.
        for (int i = 0; i < nums.length - 1; i++) {
            // Loop through the remaining elements to find a pair that adds up to the target.
            for (int j = i + 1; j < nums.length; j++) {
                // If we find a pair, we return the indices of the two numbers.
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        // If we loop through the entire array and do not find a solution, we throw an IllegalArgumentException.
        throw new IllegalArgumentException("No two sum solution");
    }





public class JavaIndex {
    public static boolean checkValue = false;

public static void main(String[] args) {
    int[] arrayValue = {1, 5, 6 , 8, 4};
    int targetValue = 7;
    
    new ArraySoltuion().twoSum(arrayValue, targetValue);
   
}  
}
 }


