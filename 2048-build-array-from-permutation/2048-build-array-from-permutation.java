class Solution {
    public int[] buildArray(int[] nums) {
        int x=nums.length;
        int []arr=new int [x];
        for(int i=0;i<x;i++){
            arr[i]=nums[nums[i]];
        }
        return arr;
    }
}