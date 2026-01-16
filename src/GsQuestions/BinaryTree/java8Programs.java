package GsQuestions.BinaryTree;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class java8Programs {

    private static int addTheNumber(int n){
        return String.valueOf(n).chars().mapToObj(c->(char)c).map(c->(c-'0')*5).reduce(0,(a,b)->b+a);
    }

    private static List<Integer> getThedivideNumber(int[] n){

        return Arrays.stream(n).boxed().filter(c->c%3==0||c%5==0).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        int n=12345;
        System.out.println(addTheNumber(n));
        int[] b={1,3,5,12,45,77};
        System.out.println(getThedivideNumber(b));
    }
}
