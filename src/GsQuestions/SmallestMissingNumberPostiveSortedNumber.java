package GsQuestions;

public class SmallestMissingNumberPostiveSortedNumber {
    public static int getSmallestMissingNumber(int[] num){
       int left=0;
       int right=num.length;
       while(left<right){
           int mid=left+(right-left)/2;
           if(num[mid]>mid){
               right=mid;
           }else{
               left=mid+1;
           }
       }

        // At the end of loop, `left` is the smallest index where arr[i] != i
        return left;
    }
    public static void main(String[] args) {
        int[] arr= {5,6,7,8,1,2, 3, 4};
//        int[] arr={3,4,-1,1};
        System.out.println(getSmallestMissingNumber(arr));
    }
}
