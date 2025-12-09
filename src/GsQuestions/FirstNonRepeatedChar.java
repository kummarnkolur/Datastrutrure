package GsQuestions;

import javax.swing.text.html.parser.Entity;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstNonRepeatedChar {
    public static char getFirstNonRepetedChar(String str) {
        Map<Character, Integer> nonRe = new LinkedHashMap<>();
        for (char c : str.toCharArray()) {
            nonRe.put(c, nonRe.getOrDefault(c, 0) + 1);
        }
        System.out.println(nonRe);
        char ch = 0;
        for (Map.Entry<Character, Integer> entry : nonRe.entrySet()) {
            if (entry.getValue() == 1) {
                ch = entry.getKey();
                break;
            }
        }
        return ch;
    }
    public static char getFirstNonRepetedCharUsingJavaAdv(String str){
        return str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(s->s,LinkedHashMap::new,Collectors.counting())).entrySet().stream().filter(entry->entry.getValue()==1).map(map->map.getKey()).findFirst().orElse(null);
    }
    public static void main(String[] args) {
        String str="123456";
        System.out.println(getFirstNonRepetedChar(str));
        System.out.println(getFirstNonRepetedCharUsingJavaAdv(str));
    }
}
