package GsQuestions;

public class JosephusProblem {
    public static int findPresident(int n, int k) {
        int result = 0; // base case: J(1, k) = 0
        for (int i = 2; i <= n; i++) {
            result = (result + k) % i;
        }
        return result + 1; // convert from 0-based to 1-based index
    }

    public static void main(String[] args) {
        int n = 3; // number of students
        int k = 2; // song length
        System.out.println("The elected student is: " + findPresident(n, k));
    }
}
