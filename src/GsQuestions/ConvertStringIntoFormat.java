package GsQuestions;

public class ConvertStringIntoFormat {
    public static String getFormat(String str){
        int count=1;
        String formate="";
        for(int i=1;i<=str.length();i++){
            if(i<str.length()&&str.charAt(i)==str.charAt(i-1)){
                count++;
            }else{
                formate=formate+str.charAt(i-1)+count;
                count=1;
            }
        }
        return formate;
    }
    public static void main(String[] args) {
          System.out.println(getFormat("aabbbaa"));
    }
}
