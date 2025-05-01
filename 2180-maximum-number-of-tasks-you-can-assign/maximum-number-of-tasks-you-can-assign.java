class Solution {
    public int maxTaskAssign(int[] tasks, int[] workers, int pills, int strength) {
        Arrays.sort(tasks);
        Arrays.sort(workers);
        int l = 0, r = Math.min(tasks.length, workers.length);
        while (l < r) {
            int mid = (l + r + 1) / 2;
            int used = 0;
            TreeMap<Integer, Integer> map = new TreeMap<>();
            for (int i = workers.length - mid; i < workers.length; ++i)
                map.put(workers[i], map.getOrDefault(workers[i], 0) + 1);
            boolean possible = true;
            for (int i = mid - 1; i >= 0; --i) {
                int t = tasks[i];
                Integer w = map.floorKey(Integer.MAX_VALUE);
                if (w != null && w >= t) {
                    dec(map, w);
                } else {
                    Integer key = map.ceilingKey(t - strength);
                    if (key == null || ++used > pills) {
                        possible = false;
                        break;
                    }
                    dec(map, key);
                }
            }
            if (possible)
                l = mid;
            else
                r = mid - 1;
        }
        return l;
    }
    public void dec(TreeMap<Integer, Integer> map, int k) {
        int c = map.get(k);
        if (c == 1) map.remove(k);
        else map.put(k, c - 1);
    }
}
