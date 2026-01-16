package GsQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MoveZeroToEnd {

    public static int[] moveZeroToEnd(int[] arr){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
               arr[j]=arr[i];
               j++;
            }
        }
        while (j<arr.length){
            arr[j++]=0;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] a={0, 1, 0, 3, 12};
        int[] arr=moveZeroToEnd(a);

        for (int i:arr){
            System.out.print(i+" ");
        }
        String str="aabbcedaa";
        String str1=str.chars()
                        .mapToObj(c->(char)c)
                                .reduce(
                                        new StringBuilder(),
                                        (sb,c)->{
                                            if(sb.length()==0||sb.charAt(sb.length() - 1) != c){
                                                sb.append(c);
                                            }
                                            return sb;
                                        },
                                        StringBuilder::append
                                ).toString();
        System.out.println(str1);

        String[] stre={"abcd","2345","7542wq"};
        List<Integer> gdh= Arrays.stream(stre).map(c->{
            try{
                return Integer.parseInt(c);
            }catch (Exception e){
                return null;
            }
        }).filter(c->c!=null).collect(Collectors.toList());
        System.out.println(gdh);
    }
}
