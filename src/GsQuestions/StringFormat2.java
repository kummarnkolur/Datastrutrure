package GsQuestions;

class StringFormat2 {
    public static int compress(char[] chars) {
        int obelix = 0;      // position to write the compressed char
        int asterix = 0;       // position to read the input chars

        while (asterix < chars.length) {//0<13
            char currentChar = chars[asterix]; //a
            int count = 0;

            // Count consecutive chars
            while (asterix < chars.length && chars[asterix] == currentChar) {//1<13&&b=a
                asterix++;//1
                count++;//1
            }

            // Write the character
            chars[obelix++] = currentChar;

            // If count > 1, write each digit of the count
            if (count > 1) {
                String countStr = Integer.toString(count);
                for (char c : countStr.toCharArray()) {
                    chars[obelix++] = c;
                }
            }
        }

        return obelix;  // New length after compression
    }
    public static void main(String[] args) {
        char[] arr= {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.println(compress(arr));

    }
}

