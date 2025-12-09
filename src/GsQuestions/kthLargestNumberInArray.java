package GsQuestions;

import java.util.PriorityQueue;

public class kthLargestNumberInArray {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pr=new PriorityQueue<>();
        for(Integer c:nums){
            pr.offer(c);
            if(pr.size()>k){
                pr.poll();
            }
        }
        return pr.peek();
    }

    public static void main(String[] args) {
        int[] nums={3,2,1,5,6,4};
        System.out.println(findKthLargest(nums,3));
    }
}
