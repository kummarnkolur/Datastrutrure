package GsQuestions;

public class MinimumPathSum {
    public static int minPathSum(int[][] grid) {
        int m = grid.length, n = grid[0].length;

        // If start or end is blocked
        if (grid[0][0] == -1 || grid[m-1][n-1] == -1) {
            return -1;
        }

        int[][] dp = new int[m][n];
        final int maxValue = Integer.MAX_VALUE / 2; // avoid overflow

        // Initialize dp with INF
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = maxValue;
            }
        }

        dp[0][0] = grid[0][0]; // starting point

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == -1) continue; // obstacle

                if (i > 0 && dp[i-1][j] != maxValue) {
                    dp[i][j] = Math.min(dp[i][j], dp[i-1][j] + grid[i][j]);
                }
                if (j > 0 && dp[i][j-1] != maxValue) {
                    dp[i][j] = Math.min(dp[i][j], dp[i][j-1] + grid[i][j]);
                }
            }
        }

        return dp[m-1][n-1] == maxValue ? -1 : dp[m-1][n-1];
    }

    public static void main(String[] args) {
        int[][] grid = {
                {1, 3, 1},
                {1, -1, 1},
                {4, 2, 1}
        };
        System.out.println(minPathSum(grid)); // Output: 7
    }
}