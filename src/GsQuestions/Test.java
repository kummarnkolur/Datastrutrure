package GsQuestions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static int trap(int[] height){
        if(height==null ||height.length==0){
            return 0;
        }
        int n=height.length;
        int[] leftMax=new int[n];
        int[] rightMax=new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(leftMax[i-1],height[i]);
        }
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1],height[i]);
        }
        int trapwater=0;
        for(int i=0;i<n;i++){
            trapwater+=Math.min(leftMax[i],rightMax[i])-height[i];
        }

        return trapwater;
    }
    public static int getCliambingStarire(int n){
        if(n<=2){
            return n;
        }
        int a=1;
        int b=2;
        int res=0;
        for(int i=3;i<=n;i++){
            res=a+b;
            a=b;
            b=res;
        }
        return res;
    }

    public static int getBinarySerach(int[] nums,int target){
        int n=nums.length;
        int left=0;
        int right=n-1;
        while(left<=right){
            int mid=left+(right-left)/2;

            if(nums[mid]==target){
                return mid;
            } else if (nums[mid]<target) {
                left=mid+1;

            }else {
                right=mid-1;
            }

        }
        return -1;
    }
    public static int findIp(String[] str){
        String regex="(\\d{1,3}\\.){3}\\d{1,3}";
        Pattern pattern=Pattern.compile(regex);
        for(String s:str){
            Matcher matcher=pattern.matcher(s);
            while(matcher.find()){
                String ip=matcher.group();
                System.out.println(ip);
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(arr));
        System.out.println(getCliambingStarire(5));
        int[] arr1={-1,0,3,5,9,12};
        int target=9;
        System.out.println(getBinarySerach(arr1,target));

        String [] str = {
                "10.0.0.1 bytes=32 time=50ms TTL=63",
                "10.0.0.2 bytes=32 time=50ms TTL=73",
                "10.0.0.4 bytes=32 time=50ms TTL=83",
                "10.0.0.2 bytes=32 time=50ms TTL=93",
        };
        System.out.println(findIp(str));


    }
}
