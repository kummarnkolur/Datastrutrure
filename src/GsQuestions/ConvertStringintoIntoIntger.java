package GsQuestions;

public class ConvertStringintoIntoIntger {
    public static int Convert(String str){
        int output=0;
        int sign=1;
        int n=str.length();
        if(str.charAt(0)=='-'){
            sign=-1;
            str=str.substring(1,n);
        } else if (str.charAt(0)=='+') {
            sign=1;
            str=str.substring(1,n);
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
                output=output*10+Integer.valueOf(str.charAt(i)-'0');
            }else{
                return -1;
            }
        }
        return sign*output;
    }
    public static void main(String[] args) {
        System.out.println(Convert("+123"));
    }
}
