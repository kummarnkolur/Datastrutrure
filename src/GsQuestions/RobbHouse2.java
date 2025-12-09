package GsQuestions;

public class RobbHouse2 {
    public static int robLinear(int[] nums) {
        int start=nums[0];
        int end=nums[nums.length-1];
        int prevMax = 0; // Represents dp[i-2]
        int currMax = 0; // Represents dp[i-1]

        for (int i = start; i <= end; i++) {
            int temp = currMax;
            currMax = Math.max(nums[i] + prevMax, currMax);
            prevMax = temp;
        }
        return currMax;
    }
    public static void main(String[] args) {
        int[] arr={1,2,1};
        System.out.println(robLinear(arr));
    }
}
