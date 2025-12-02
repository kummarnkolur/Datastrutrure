package GsQuestions.BinaryTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PathExits {
        public static boolean pathExists(int n, int[][] edges, int src, int dest) {

            if (n == 0) return false;

            if (src == dest) return true;

            Map<Integer, List<Integer>> graph = new HashMap<>();
            for (int[] e : edges) {
                graph.computeIfAbsent(e[0], k -> new ArrayList<>()).add(e[1]);
            }

            boolean[] visited = new boolean[n];
            return dfs(graph, src, dest, visited);
        }

        private static boolean dfs(Map<Integer, List<Integer>> graph, int node, int dest, boolean[] visited) {

            if (node == dest) return true;
            if (visited[node]) return false;

            visited[node] = true;

            for (int neighbor : graph.get(node)) {
                if (dfs(graph, neighbor, dest, visited)) {
                    return true;
                }
            }

            return false;
        }

        // Main to test
        public static void main(String[] args) {
            int n = 5;
            int[][] edges = {{0,1},{0,2},{1,3},{3,4}};
            int src = 0;
            int dest = 4;

            System.out.println(pathExists(n, edges, src, dest));
        }

}
