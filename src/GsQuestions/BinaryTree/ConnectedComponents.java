package GsQuestions.BinaryTree;
import java.util.*;

public class ConnectedComponents {

    public static int countComponents(int n, int[][] edges) {
        // Edge case: empty graph
        if (n == 0) return 0;

        // Build adjacency list using computeIfAbsent
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int[] edge : edges) {
            graph.computeIfAbsent(edge[0], k -> new ArrayList<>()).add(edge[1]);
            graph.computeIfAbsent(edge[1], k -> new ArrayList<>()).add(edge[0]);
        }

        boolean[] visited = new boolean[n];
        int components = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(graph, i, visited);
                components++; // each DFS traversal is one connected component
            }
        }

        return components;
    }

    private static void dfs(Map<Integer, List<Integer>> graph, int node, boolean[] visited) {
        visited[node] = true;
        for (int neighbor : graph.getOrDefault(node, Collections.emptyList())) {
            if (!visited[neighbor]) {
                dfs(graph, neighbor, visited);
            }
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int[][] edges = {{0,1},{1,2},{3,4}};
        System.out.println(countComponents(n, edges)); // Output: 2

        int[][] edges2 = {}; // No edges
        System.out.println(countComponents(n, edges2)); // Output: 5

        int[][] edges3 = {{0,1},{1,2},{2,3},{3,4}}; // Fully connected
        System.out.println(countComponents(n, edges3)); // Output: 1
    }
}

