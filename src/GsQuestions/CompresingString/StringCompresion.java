package GsQuestions.CompresingString;

public class StringCompresion {
    public static void main(String[] args) {
        char[] ch={'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.println(compress(ch));
    }
        public static int compress(char[] chars){
            int n = chars.length;
            int write = 0;  // where we write in the array
            int read = 0;   // where we read from the array

            while (read < n) {
                char current = chars[read];
                int count = 0;

                // Count how many times chars[read] repeats
                while (read < n && chars[read] == current) {
                    read++;
                    count++;
                }

                // Write the character
                chars[write++] = current;

                // Write the count (if > 1)
                if (count > 1) {
                    for (char c : String.valueOf(count).toCharArray()) {
                        chars[write++] = c;
                    }
                }
            }
            return write;
        }
}
