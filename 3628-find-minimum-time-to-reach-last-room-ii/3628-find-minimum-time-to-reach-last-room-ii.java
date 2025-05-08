class Solution {
    public int minTimeToReach(int[][] earliestTime) {
        int rows = earliestTime.length, cols = earliestTime[0].length;
        int[][][] minTime = new int[rows][cols][2];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                Arrays.fill(minTime[i][j], Integer.MAX_VALUE);

        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        minTime[0][0][0] = 0;
        queue.offer(new int[]{0, 0, 0, 0}); // time, row, col, parity

        int[][] directions = {{-1,0}, {1,0}, {0,-1}, {0,1}};

        while (!queue.isEmpty()) {
            int[] state = queue.poll();
            int currTime = state[0], row = state[1], col = state[2], parity = state[3];

            if (minTime[row][col][parity] < currTime) continue;

            for (int[] dir : directions) {
                int newRow = row + dir[0], newCol = col + dir[1];
                if (newRow < 0 || newCol < 0 || newRow >= rows || newCol >= cols) continue;

                int waitUntil = Math.max(currTime, earliestTime[newRow][newCol]);
                int nextParity = 1 - parity;
                int arrivalTime = waitUntil + 1 + parity;

                if (newRow == rows - 1 && newCol == cols - 1){
                    return arrivalTime;
                }
                if (arrivalTime < minTime[newRow][newCol][nextParity]) {
                    minTime[newRow][newCol][nextParity] = arrivalTime;
                    queue.offer(new int[]{arrivalTime, newRow, newCol, nextParity});
                }
            }
        }

        return -1;
    }
}
