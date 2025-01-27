class checkIfPrerequisite {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] pre, int[][] queries) {
        boolean[][] reach = new boolean[numCourses][numCourses];
        for (int[]pr:pre) {
            reach[pr[0]][pr[1]] = true;
        }
        // Floyd-Warshall
        for (int k=0;k<numCourses;k++) {
            for (int i=0;i<numCourses;i++) {
                for (int j=0;j<numCourses;j++) {
                    reach[i][j]=reach[i][j] || (reach[i][k] &&reach[k][j]);
                }
            }
        }
        // Process the queries
        List<Boolean> res = new ArrayList<>();
        for (int[] query : queries) {
            res.add(reach[query[0]][query[1]]);
        }
        return res;
    }
}
