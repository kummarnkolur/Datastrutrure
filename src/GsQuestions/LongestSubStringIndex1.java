package GsQuestions;

class LongestSubStringIndex1 {
    public static int getLongestSubString(String str) {
        int index = 0;
        int count = 1;
        int min = 0;
        int maxIndex = 0;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                if (min < count) {
                    min = count;
                    maxIndex = index;
                }
                index++;
                count = 1;
            }
        }
        if(min<count){
            maxIndex=index;
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        String str = "aabbbbccddddddd";
        System.out.println(getLongestSubString(str));
    }
}
