package GsQuestions;

public class MaxAverageSubarray {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;

        // Compute the sum of the first k elements
        double windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        double maxSum = windowSum;

        // Slide the window
        for (int i = k; i < n; i++) {
            windowSum += nums[i] - nums[i - k];  // add next, remove first
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum / k;
    }

    // Test the function
    public static void main(String[] args) {
        MaxAverageSubarray solution = new MaxAverageSubarray();
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        System.out.printf("%.5f\n", solution.findMaxAverage(nums, k));
        // Output: 12.75000
    }
}

