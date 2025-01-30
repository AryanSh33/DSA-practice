//LEET 2493. Divide Nodes Into the Maximum Number of Groups
class magnificentSets{
    public int magnificentSets(int n, int[][] edges) {
        List<Integer>[] li = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) li[i] = new ArrayList<>();
        for (int[] edge : edges) {
            li[edge[0]].add(edge[1]);
            li[edge[1]].add(edge[0]);
        }
        int[] arr = new int[n + 1];
        Arrays.fill(arr, -1);
        Queue<Integer> q = new LinkedList<>();
        int res = 0;
        for (int i = 1; i <= n; i++) {
            if (arr[i] >= 0) continue;
            q.add(i);
            arr[i] = 0;
            List<Integer> component = new ArrayList<>();
            boolean isBipartite = true;
            while (!q.isEmpty()) {//bfs
                int cur = q.poll();
                component.add(cur);
                for (var next : li[cur]) {
                    if (arr[next] == -1) {
                        arr[next] = 1 - arr[cur];
                        q.add(next);
                    } else if (arr[next] == arr[cur]) {
                        return -1; // if graph is not bipartite
                    }
                }
            }

            // finding max depth using BFS
            int maxDepth = 0;
            for (int node : component) {
                maxDepth = Math.max(maxDepth, bfsDepth(node, li));
            }
            res += maxDepth;
        }
        return res;
    }

    private int bfsDepth(int start, List<Integer>[] li) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        int[] depth = new int[li.length];
        Arrays.fill(depth, -1);
        depth[start] = 1;
        int maxDepth = 1;

        while (!q.isEmpty()) {
            int cur = q.poll();
            for (int next : li[cur]) {
                if (depth[next] != -1){
                    continue;
                    }
                depth[next] = depth[cur] + 1;
                maxDepth = Math.max(maxDepth, depth[next]);
                q.add(next);
            }
        }
        return maxDepth;
    }
}
