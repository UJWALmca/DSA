public class MissingNumberFinder {
    public static int findMissingNumber(int[] nums) {
        int n = nums.length + 1;
        // Calculate the sum of integers from 1 to n
        int sum = (n * (n + 1)) / 2;

        // Calculate the sum of elements in the array
        int arraySum = 0;
        for (int num : nums) {
            arraySum += num;
        }

        // The missing number is the difference between the sum of integers from 1 to n
        // and the sum of elements in the array
        return sum - arraySum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 5, 6}; // Sample array with a missing number
        int missingNumber = findMissingNumber(nums);
        System.out.println("The missing number is: " + missingNumber);
    }
}
