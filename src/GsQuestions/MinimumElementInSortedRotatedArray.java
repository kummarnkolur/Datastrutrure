package GsQuestions;

public class MinimumElementInSortedRotatedArray {
    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                // Minimum is in the right half
                left = mid + 1;
            } else {
                // Minimum is at mid or in the left half
                right = mid;
            }
        }

        // At the end, left == right pointing to minimum
        return nums[left];
    }
    public static void main(String[] args) {
        int[] arr={5, 6, 1, 2, 3, 4};
        System.out.println(findMin(arr));
    }
}
