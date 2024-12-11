class Solution {
    public int maximumBeauty(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int maxCount = 0;
        int count = 0;// sliding window
        for (int i = 0; i < n; i++) {
            while (nums[i] - nums[count] > 2 * k) {//check if range is valid
                count++;//shrink the size of the window
            }
            maxCount = Math.max(maxCount, i - count + 1);
        }
        return maxCount;
    }
}
