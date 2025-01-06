class minOperations {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int cost = 0;
            for (int j = 0; j < n; j++) {
                if (boxes.charAt(j) == '1') {// adjacent boxes;
                    cost += Math.abs(i - j);
                }
            }
            arr[i] = cost;
        }
        return arr;
    }
}
