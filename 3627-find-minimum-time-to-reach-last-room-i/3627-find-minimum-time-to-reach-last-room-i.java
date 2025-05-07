class Solution {
    public int minTimeToReach(int[][] mt) {
        int nr = mt.length;
        int nc = mt[0].length;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.add(new int[]{0, 0, 0});

        int[][] tm = new int[nr][nc];
        for (int ri = 0; ri < nr; ri++) {
            for (int ci = 0; ci < nc; ci++)
                tm[ri][ci] = Integer.MAX_VALUE;
        }

        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};

        while (!pq.isEmpty()) {
            int[] st = pq.poll();
            int ct = st[0];
            int rx = st[1];
            int cy = st[2];

            if (rx == nr - 1 && cy == nc - 1) return ct;

            for (int di = 0; di < 4; di++) {
                int nx = rx + dx[di];
                int ny = cy + dy[di];

                if (nx >= 0 && nx < nr && ny >= 0 && ny < nc) {
                    int wt = mt[nx][ny];
                    int nt = Math.max(ct + 1, wt + 1);

                    if (tm[nx][ny] > nt) {
                        tm[nx][ny] = nt;
                        pq.add(new int[]{nt, nx, ny});
                    }
                }
            }
        }

        return -1;
    }
}
