package GsQuestions;

import java.util.List;

public class StringContainsSubString {
    public static String getStringContainsSubSTring(String[] arr, String str){
        String longestString=arr[0];
        int lenth=0;
        for(String s:arr){
            if(s.contains(str)){
                if(lenth<s.length()){
                    longestString=s;
                    lenth=s.length();
                }
            }
        }
        return longestString;
    }
    public static void main(String[] args) {
        String str="ODG";
        String[] arr={"CODGE", "ODG", "LODGES", "SODG", "dodge", "mODJ", "LODGESSSS"};
        System.out.println(getStringContainsSubSTring(arr,str));
    }
}
