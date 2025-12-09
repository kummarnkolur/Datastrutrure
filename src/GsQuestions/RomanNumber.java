package GsQuestions;

import java.util.HashMap;
import java.util.Map;

public class RomanNumber {
    public static int romanToInt(String s) {
        if (s == null || s.isEmpty()) {
            return -1;
        }
        Map<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int result=0;
//        int current=0;
        for(int i=0;i<s.length();i++){
            char currentChar = s.charAt(i);
            int current = map.getOrDefault(currentChar, 0);
            if(current==0){
                return -1;
            }

            if(i+1<s.length()){
                int next=map.get(s.charAt(i+1));
                if(current<next){
                    result-=current;
                }else{
                    result+=current;
                }
            }else{
                result+=current;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("IX"));
        System.out.println(romanToInt("III"));

    }
}
