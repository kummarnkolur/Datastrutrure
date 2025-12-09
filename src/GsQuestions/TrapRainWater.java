package GsQuestions;

public class TrapRainWater {
    public static int trap(int[] height) {
            if (height == null || height.length == 0) {
                return 0;
            }

            int n = height.length;
            int[] leftMax = new int[n];
            int[] rightMax = new int[n];

            // Compute leftMax array
            leftMax[0] = height[0];
            for (int i = 1; i < n; i++) {
                leftMax[i] = Math.max(leftMax[i - 1], height[i]);
            }

            // Compute rightMax array
            rightMax[n - 1] = height[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                rightMax[i] = Math.max(rightMax[i + 1], height[i]);
            }

            // Calculate the trapped water
            int waterTrapped = 0;
            for (int i = 0; i < n; i++) {
                waterTrapped += Math.min(leftMax[i], rightMax[i]) - height[i];
            }

            return waterTrapped;
        }
        public static void main(String[] args){
            int[] arr={1,8,6,2,5,4,8,3,7};
            System.out.println(trap(arr));
        }
}
