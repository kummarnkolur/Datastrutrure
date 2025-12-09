package GsQuestions;

public class SumOfNumbersSliderWindow {
    public static int getSumOfTwoNumber(int[] arr,int k){
        int left=0,sum=0;
        int minLength=Integer.MAX_VALUE;
        for(int right=0;right<arr.length;right++){
            sum+=arr[right];

            while (sum>k&&left<=right){
                sum-=arr[left];
                left++;
            }

            if(sum==k){
                minLength=Math.min(minLength,right-left+1);
            }
        }
        return (minLength==Integer.MAX_VALUE)?-1:minLength;
    }
    public static void main(String[] args) {
        int[] arr= {2, 4, 6, 10, 2, 1};
        int k=12;
        System.out.println(getSumOfTwoNumber(arr,k));


    }
}
