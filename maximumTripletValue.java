// LEET 2873. Maximum Value of an Ordered Triplet I
class Solution {
    public long maximumTripletValue(int[] nums) {
        long res = 0;
        int cur = 0;
        int dif = 0;
        for (int v : nums) {
            res = Math.max(res, (long) dif * v);//nums[i]-nums[j]*nums[k];
            dif = Math.max(dif, cur - v);// nums[i]-nums[j]
            cur = Math.max(cur, v);//nums[k]
        }
        return res;
    }
}

//class Solution {
//    public long maximumTripletValue(int[] nums) {
//        long res = 0;
//        for (int i = 0; i < nums.length - 2; i++) {
//            for (int j = i + 1; j < nums.length - 1; j++) {
//                if (nums[i] > nums[j]) {
//                    long sub = nums[i] - nums[j];
//                   for (int k = j + 1; k < nums.length; k++) {
//                        res = Math.max((long) sub * nums[k], res);
//                    }
//                }
//            }
//        }
//        return res;
//    }
//}
