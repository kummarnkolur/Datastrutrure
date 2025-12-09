package GsQuestions;

import java.util.*;

public class GroupAnagramsByFrequency {

    public static void main(String[] args) {
        String[] input = {"cat", "act", "tap", "pat", "tac", "apt"};

        List<List<String>> result = groupAnagrams(input);
            System.out.println(result);
    }

    public static List<List<String>> groupAnagrams(String[] words) {

        Map<String, List<String>> map = new HashMap<>();

        for (String word : words) {
            String key = buildFrequencyKey(word);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }

        return new ArrayList<>(map.values());
    }

    private static String buildFrequencyKey(String word) {
        int[] freq = new int[26];

        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int count : freq) {
            sb.append(count).append("#");
        }

        return sb.toString();
    }
}

