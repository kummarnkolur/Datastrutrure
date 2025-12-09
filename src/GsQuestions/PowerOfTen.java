package GsQuestions;

public class PowerOfTen {
    public static boolean isGivenNumberPowerOfTen(int n){
        if(n<=0)
            return false;
        while(n>1){
            if(n%10!=0)
                return false;
            n=n/10;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isGivenNumberPowerOfTen(1000));
        //"(\\d{1,3}\\.){3}\\d{1,3}"
    }
}
