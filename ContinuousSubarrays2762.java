class ContinuousSubarrays2762 {
    public long continuousSubarrays(int[] nums) {
        long count=0;
        int left=0;
        int min=nums[0],max=min;
        for(int right=0;right<nums.length;right++){
            min=Math.min(min,nums[right]);
            max=Math.max(max,nums[right]);
        while(max-min>2){
            left++;
            min=nums[left];
            max=min;
            for(int i=left;i<=right;i++){
                min=Math.min(nums[i],min);
                max=Math.max(nums[i],max);
            }
        }
        count+=right-left+1;
    }
    return count;
}
}
