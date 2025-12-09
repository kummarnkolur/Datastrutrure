package GsQuestions;

import java.util.Stack;

public class Temprature {
    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>();  // stores indexes

        for (int i = 0; i < n; i++) {
            // Check if current temp is warmer than temps at indexes in stack
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int idx = stack.pop();
                answer[idx] = i - idx;
            }
            stack.push(i);
        }

        // Remaining indexes in stack have answer[i] = 0 by default
        return answer;
    }

    public static void main(String[] args) {
       int [] tem={73,74,75,71,69,72,76,73};
       int[] output=dailyTemperatures(tem);
       for(int num:output){
           System.out.print(num+",");
       }
    }
}
