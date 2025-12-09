package GsQuestions;

public class fibonicSeries {
    public static int getFibonic(int n){
        if(n<=1){
            return n;
        }
        return getFibonic(n-2)+getFibonic(n-1);
    }
    public static void main(String[] args) {
        System.out.println(getFibonic(10));
    }
}
