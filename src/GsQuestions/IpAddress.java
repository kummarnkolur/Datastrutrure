package GsQuestions;

import java.util.HashMap;
import java.util.Map;

public class IpAddress {
    public static String getMostRepetaedIp(String[] str){
        Map<String, Integer> map=new HashMap<>();
        for(int i=0;i<str.length;i++){
          String[] ch=str[i].split("\\s+");
          map.put(ch[0],map.getOrDefault(ch[0],0)+1);
        }
        String finalIp="";
        int n=0;
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(entry.getValue()>n){
                finalIp=entry.getKey();
                n=entry.getValue();
            }
        }
        System.out.println(map);
        return finalIp;
    }
    public static void main(String[] args) {
        String [] str = {
                "10.0.0.1 bytes=32 time=50ms TTL=63",
                "10.0.0.2 bytes=32 time=50ms TTL=73",
                "10.0.0.4 bytes=32 time=50ms TTL=83",
                "10.0.0.2 bytes=32 time=50ms TTL=93",
        };
        System.out.println(getMostRepetaedIp(str));
    }
}
