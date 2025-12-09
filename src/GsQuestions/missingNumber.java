package GsQuestions;

public class missingNumber {
        public static int getMissingNumber(int[] nums) {
            int n = nums.length;
            int expectedSum = n * (n + 1) / 2;
            int actualSum = 0;
            for (int num : nums) {
                actualSum += num;
            }
            return expectedSum - actualSum;
        }

    public static void main(String[] args) {
        int[] nums={0,1,3,2,5};
        System.out.println(getMissingNumber(nums));
    }
}
