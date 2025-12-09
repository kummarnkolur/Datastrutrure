package GsQuestions;

public class RobbHouse {
    public static int getTotalHouseRob(int[] nums){
        int n = nums.length;

        // Handle edge cases for empty or single-house arrays
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return nums[0];
        }

        // dp[i] represents the maximum amount of money that can be robbed
        // from houses up to index i (inclusive).
        int[] dp = new int[n];

        // Base cases:
        // For the first house, the maximum is just its value.
        dp[0] = nums[0];
        // For the second house, the maximum is the greater of robbing
        // the first house or the second house.
        dp[1] = Math.max(nums[0], nums[1]);//dp=1,2,5,6

        // Iterate from the third house onwards
        for (int i = 2; i < n; ++i) {
            // For each house, there are two choices:
            // 1. Don't rob the current house: The maximum is the same as dp[i-1].
            // 2. Rob the current house: The maximum is nums[i] plus the maximum
            //    from houses up to i-2 (since adjacent houses cannot be robbed).
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);//5,6
        }

        // The result is the maximum amount from robbing all houses up to the last one.
        return dp[n - 1];
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,1};
          System.out.print(getTotalHouseRob(arr));
    }
}
