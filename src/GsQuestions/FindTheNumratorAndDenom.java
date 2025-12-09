package GsQuestions;

public class FindTheNumratorAndDenom {
    public static int findGcf(int a, int b){
        if(b==0)
        return a;
       return findGcf(b,a%b);
    }
    public static int[] getNumAndDeno(int num1,int den1,int num2,int den2){
        int numatorSum=num1*den2+num2*den1;
        int denmanatoreSum=den1*den2;

        int gcf= findGcf(Math.abs(numatorSum),Math.abs(denmanatoreSum));
        numatorSum/=gcf;
        denmanatoreSum/=gcf;

        if(denmanatoreSum<0){
            numatorSum=-numatorSum;
            denmanatoreSum=-denmanatoreSum;
        }
        return new int[]{numatorSum,denmanatoreSum};
    }
    public static void main(String[] args) {
        int[] arr=getNumAndDeno(1,3,3,9);
        System.out.println(arr[0]+"/"+arr[1]);
    }
}
