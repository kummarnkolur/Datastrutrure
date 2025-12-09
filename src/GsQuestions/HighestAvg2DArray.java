package GsQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HighestAvg2DArray {
    public static String getHihestAvg(String[][] markslist){
        Map<String,Integer> sumMap=new HashMap<>();
        Map<String,Integer> countMap=new HashMap<>();

        for(String[] students: markslist){
            String name=students[0];
            int marks=Integer.parseInt(students[1]);
            sumMap.put(name,sumMap.getOrDefault(name,0)+marks);
            countMap.put(name,countMap.getOrDefault(name,0)+1);
        }
        System.out.println(sumMap);
        System.out.println(countMap);
        double maxAvg=0.0;
        String name="";
        for(String stud:sumMap.keySet()){
            double avg=(double) sumMap.get(stud)/countMap.get(stud);
            if(avg>maxAvg){
                maxAvg=avg;
                name=stud;
            }
        }
        return name+" Secured the Higest Avg of "+maxAvg;
    }
    public static void main(String[] args) {
        String[][] student={{"Charles", "84"},
                        {"John", "100"},
                        {"Andy", "37"},
                        {"John", "23"},
                        {"Charles", "20"}};
        System.out.println(getHihestAvg(student));
        Map<String, Double> highestAvg= Arrays.stream(student).collect(Collectors.groupingBy(entry->entry[0],Collectors.averagingDouble(entry -> Double.parseDouble(entry[1]))));
        Map.Entry<String,Double> avg=highestAvg.entrySet().stream().max(Map.Entry.comparingByValue()).orElseThrow();
        System.out.println(avg);
    }
}
