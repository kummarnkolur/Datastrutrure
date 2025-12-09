package GsQuestions;

import java.util.HashMap;
import java.util.Map;

public class NumaratorAndDenomi {
       public static String NumToDecimal(long numerator, long denominator) {

     if(numerator == 0) return "0";

     StringBuilder sb = new StringBuilder();

     if((numerator < 0) ^ (denominator < 0)) sb.append("-");

     long num = Math.abs(numerator);

     long den = Math.abs(denominator);

     sb.append(num/den);

     num %= den;

     if(num == 0) return sb.toString();

     sb.append(".");

     Map<Long, Integer> map = new HashMap<>();

     while(num != 0) {

       if(map.containsKey(num)) {

         sb.insert(map.get(num), "(");

         sb.append(")");

         break;

       }

       map.put(num, sb.length());

       num *= 10;

       sb.append(num/den);

       num %= den;

     }

     return sb.toString();

   }

    public static void main(String[] args) {
        System.out.println(NumToDecimal(50,22));
    }

}
