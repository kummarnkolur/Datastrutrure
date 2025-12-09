package GsQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DictContinsSameWord {
    public static List<String> getWords(String[] dic,String word){
        List<String> list=new ArrayList<>();
        int[] wordFreq=new int[26];
        for(char ch:word.toCharArray()){
            wordFreq[ch-'a']++;
        }
        String sdf=Arrays.toString(wordFreq);
//          sdf=sdf.replaceAll("[^0-9]","");
//        System.out.println(sdf);
       for(String w:dic){
//           int[] freq=wordFreq;
           if(isFrequencyMatch(w,sdf)&&word.length()==w.length()){
               list.add(w);
           }

       }
//        System.out.println(Arrays.asList(wordFreq));
        return list;
    }
    public static boolean isFrequencyMatch(String word,String wordSb){
        int[] wordFreq=new int[26];
        for(char ch:word.toCharArray()){
            wordFreq[ch-'a']++;
        }
        String cleaned=Arrays.toString(wordFreq);//.replaceAll("[^0-9]","");
        return wordSb.equals(cleaned);
    }
    public static void main(String[] args) {
        String[] dict = {"ab", "abcd", "bcdaf", "bcad", "acb", "acab","dcba"};
        String input = "abcd";
        System.out.println(getWords(dict,input));
    }
}
