package GsQuestions;

import java.util.*;

public class NextGreatestElement {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> nextGreaterMap = new HashMap<>();
        Deque<Integer> stack = new ArrayDeque<>();

        // Build next greater map for nums2
        for (int num : nums2) {
            while (!stack.isEmpty() && num > stack.peek()) {
                nextGreaterMap.put(stack.pop(), num);
            }
            stack.push(num);
        }

        // For elements without a next greater element
        while (!stack.isEmpty()) {
            nextGreaterMap.put(stack.pop(), -1);
        }

        // Prepare result for nums1 by looking up map
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = nextGreaterMap.get(nums1[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] num1={4,1,2};
        int[] num2={1,3,4,2};
        int[] output=nextGreaterElement(num1,num2);
        for(int num:output){
            System.out.print(num+",");
        }
    }
}

