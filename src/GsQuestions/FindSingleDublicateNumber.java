package GsQuestions;

public class FindSingleDublicateNumber {
    public static int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];         // move slow by 1 step
            fast = nums[nums[fast]];   // move fast by 2 steps
        } while (slow != fast);

        // Phase 2: Find the entrance to the cycle.
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;  // duplicate number
    }

    public static void main(String[] args) {
        int[] nums={1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }
}
