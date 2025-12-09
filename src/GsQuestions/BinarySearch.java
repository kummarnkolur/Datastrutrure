package GsQuestions;

public class BinarySearch {
    public static int serach(int[] nums,int target){
        int left = 0;
        int right = nums.length - 1; //5

        while (left <= right) {//3<=5
            int mid = left + (right - left)/2; // 2;  3+(5-3)/2=4

            if (nums[mid] == target) {//3==9
                return mid;
            } else if (nums[mid] < target) {//3<9,
                left = mid + 1; //3
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={-1,0,3,5,9,12};
        int target=9;
        System.out.println(serach(arr, target));
    }
}
