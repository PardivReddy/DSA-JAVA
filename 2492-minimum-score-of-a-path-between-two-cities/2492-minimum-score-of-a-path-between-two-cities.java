import java.util.*;

class Solution {
    public int minScore(int n, int[][] roads) {
        List<List<int[]>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] road : roads) {
            int u = road[0];
            int v = road[1];
            int dist = road[2];
            adj.get(u).add(new int[]{v, dist});
            adj.get(v).add(new int[]{u, dist});
        }

        int minScore = Integer.MAX_VALUE;
        boolean[] visited = new boolean[n + 1];
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(1);
        visited[1] = true;

        while (!queue.isEmpty()) {
            int u = queue.poll();

            for (int[] neighbor : adj.get(u)) {
                int v = neighbor[0];
                int dist = neighbor[1];

                minScore = Math.min(minScore, dist);

                if (!visited[v]) {
                    visited[v] = true;
                    queue.offer(v);
                }
            }
        }

        return minScore;
    }
}