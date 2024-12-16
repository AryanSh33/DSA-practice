class MultiplyingSmallestElementOfArrayWithK {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        while (k != 0) {//performing k no.of operations
            int x = 100000;
            int minIndex = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < x) {//picking the minimum number
                    x = nums[i];
                    minIndex = i;//saving the index of the minimum number to perform the operation
                }
            }
            nums[minIndex] *= multiplier;//performing the operation
            k--;
        }
        return nums;
    }
}
