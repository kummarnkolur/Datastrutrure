package GsQuestions;

public class MedianOfTwoSortedArrayusingBinarySerach {
    public static int getMedian(int[] a,int[] b){
        if(a.length>b.length){
            getMedian(b,a);
        }
        int n=a.length;//5
        int m=b.length;//6
        int start=0, end=n;//5
        int total=m+n;
        while(start<=end){
            int partionX=(start+end)/2;//2
            int partionY=((m+n+1)/2)-partionX;//4

            int maxLeft1 = (partionX==0)? Integer.MIN_VALUE:  a[partionX-1];
            int minRight1 = (partionX== n)? Integer.MAX_VALUE: a[partionX];

            int maxLeft2 = (partionY==0)? Integer.MIN_VALUE: b[partionY-1];
            int minRight2 =  (partionY== m)? Integer.MAX_VALUE: b[partionY];

            if(maxLeft1<=minRight2&&maxLeft2<=minRight1){
                if(total%2==0){
                    return (Math.max(maxLeft1,maxLeft2)+(Math.min(minRight1,minRight2)))/2;
                }else{
                    return Math.max(maxLeft1,maxLeft2);
                }
            }else if(maxLeft1<minRight2){
                start=partionX+1;
            }else{
                end=partionY-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a={1,3,8,9,15};
        int[] b={7,11,18,19,21,25};
        System.out.println(getMedian(a,b));
        getMedian(a,b);
    }
}
