package GsQuestions;
public class RemoveAdjacentGroups {
    public static String removeDuplicates(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int[] count = new int[s.length()]; // to store count of consecutive chars

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            sb.append(c);
            int last = sb.length() - 1;

            // if current char same as previous
            if (last > 0 && sb.charAt(last) == sb.charAt(last - 1)) {
                count[last] = count[last - 1] + 1;
            } else {
                count[last] = 1;
            }

            // if count reaches k → remove last k chars
            if (count[last] == k) {
                sb.delete(sb.length() - k, sb.length());
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
//        System.out.println(removeDuplicates("aabbcccbb", 2));   // Output: cccbb
        System.out.println(removeDuplicates("deeedbbcccbdaa", 3)); // Output: aa
    }
}