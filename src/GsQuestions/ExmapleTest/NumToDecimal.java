package GsQuestions.ExmapleTest;

import java.util.HashMap;
import java.util.Map;

public class NumToDecimal {
    public static String getNumToDecimal(int numarator,int denominator){
        if(numarator==0) return "0";
        StringBuilder builder=new StringBuilder();

        if((numarator<0)^(denominator<0)) builder.append("-");
        long num=Math.abs(numarator);
        long den=Math.abs(denominator);
        builder.append(num/den);
        num%=den;

        if(num==0) return builder.toString();
        builder.append(".");

        Map<Long,Integer> map=new HashMap<>();
        while(num!=0){
            if(map.containsKey(num)){
                builder.insert(map.get(num),"(");
                builder.append(")");
                break;
            }
            map.put(num,builder.length());
            num*=10;
            builder.append(num/den);
            num%=den;
        }
      return builder.toString();
    }
    public static void main(String[] args) {
       System.out.println(getNumToDecimal(10,2));
    }
}
