package GsQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupOfAngram {
    public static List<List<String>> findGroupOfAngram(String[] str) {
        Map<String, List<String>> map = new HashMap<>();

        StringBuilder builder = null;
        for (String s : str) {
            int[] freq = new int[26];
            for (char c : s.toCharArray()) {
                freq[c - 'a']++;
            }
            builder = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                builder.append(freq[i]);
                builder.append("#");
            }
            String key = builder.toString();
            map.computeIfAbsent(key,k->new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        String[] str={"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> list=findGroupOfAngram(str);
        System.out.println(list);

    }
}
