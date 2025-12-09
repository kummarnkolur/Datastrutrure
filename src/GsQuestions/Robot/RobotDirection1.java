package GsQuestions.Robot;

public class RobotDirection1 {
    public static void getCoridnatesForRobotcommand(String str){
        int m=0,n=0;
      for(int i=0;i<str.length();i++){
          switch (str.charAt(i)){
              case 'U':
                  m++;
                  break;
              case 'R':
                  n++;
                  break;
              case 'D':
                  m--;
                  break;
              case 'L':
                  n--;
                  break;
              default:
              System.out.println("Wrong");
          }
      }
      System.out.println("("+n+","+m+")");
    }
    public static void getForAny(String str){
        if(str.contains(" ")){
            String[] str1=str.split(" ");
            String finalstr="";
            for(int i=0;i<str1.length;i++){
                if(Character.isDigit(str1[i].charAt(0))){
                    int k=1;
                    int k1=str1[i].charAt(0)-'0';
                    while (k<=k1) {
                        finalstr = finalstr + str1[i].charAt(2);
                        k++;
                    }
                }else{
                    finalstr=finalstr+str1[i].charAt(0);
                }
            }
            getCoridnatesForRobotcommand(finalstr);
        }else{
            getCoridnatesForRobotcommand(str);
        }
    }
    public static void main(String[] args) {
//        String str="URRDDL";//URRDDL
        String str="DOWN UP 2xRIGHT DOWN 3xLEFT";
        getForAny(str);
    }
}
