//LEET 1402. Reducing Dishes
class maxSatisfaction{
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int time = 0, total = 0, n = satisfaction.length;
        for (int i = n - 1; i >= 0; --i) {
            if (satisfaction[i] > -total) {
                total += satisfaction[i];
                time += total;
            }
        }
        return time;
    }
}
