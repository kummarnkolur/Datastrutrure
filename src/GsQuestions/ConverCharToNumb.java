package GsQuestions;

public class ConverCharToNumb {
    public static String getConvertCharToNum(String str){
        int count=1;
        StringBuilder output= new StringBuilder();
        for(int i=1;i<=str.length();i++){
            if(i<str.length()&&str.charAt(i)==str.charAt(i-1)){
                count++;
            }else{
                output.append(str.charAt(i - 1)).append(count);
                count=1;
            }
        }
        return output.toString();
    }
    public static void main(String[] args) {
        System.out.println(getConvertCharToNum("aabbccaa"));
    }
}
