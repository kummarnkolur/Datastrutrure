package GsQuestions.java8;

import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class FindTheAccuranceOfEachChar {
    public static void main(String[] args) {
        String str="abcbgdfdyu";
        Map<Character,Long> map=str.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
        Character ch=map.entrySet().stream().sorted(Comparator.comparing(Map.Entry<Character,Long>::getValue).reversed().thenComparing(Map.Entry::getKey)).findFirst().get().getKey();
        System.out.println(ch);
    }
}
