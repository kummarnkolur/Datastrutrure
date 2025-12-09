package GsQuestions;

public class RotatingortedBinarySeracArray {
    public static int serach(int[] nums,int target){
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left)/2; // 2;  0+(5+0)/3
            // System.out.println(5/2);

            if (nums[mid] == target) {//3==9
                return mid;
            }

            if (nums[left] <= nums[mid]) {
                // If target is in the sorted left half
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else { // Target is in the unsorted right half
                    left = mid + 1;
                }
            }
            // The right half must be sorted
            else {
                // If target is in the sorted right half
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else { // Target is in the unsorted left half
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        int target=0;
        System.out.println(serach(arr, target));
    }
}
