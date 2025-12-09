package GsQuestions;

public class MinDistanceBetweenWords {
    public static int minDistance(String sentence, String word1, String word2) {
        String[] words = sentence.split("\\s+");  // Split by spaces (handle multiple spaces)

        int minDistance = Integer.MAX_VALUE;
        int index1 = -1, index2 = -1;

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1)) {
                index1 = i;
                if (index2 != -1) {
                    minDistance = Math.min(minDistance, Math.abs(index1 - index2));
                }
            }
            if (words[i].equals(word2)) {
                index2 = i;
                if (index1 != -1) {
                    minDistance = Math.min(minDistance, Math.abs(index1 - index2));
                }
            }
        }

        // If either word not found, return -1 or some invalid value
        if (index1 == -1 || index2 == -1) {
            return -1;
        }

        // Since you want the number of words **between** them,
        // subtract 1 from the absolute difference
        return minDistance - 1;
    }

    public static void main(String[] args) {
        String str = "the quick the brown quick brown the frog";
        String w1 = "quick";
        String w2 = "frog";

        int result = minDistance(str, w1, w2);
        System.out.println(result);  // Output: 2
    }
}

