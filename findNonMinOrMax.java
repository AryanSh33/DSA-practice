class findNonMinOrMax {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length<3){
            return -1;
        }
        int res;
        int max=nums[0];
        int min=nums[0];
        for(int v:nums){
            max=Math.max(v,max);
            min=Math.min(v,min);
        }
        if(max==min){
            return -1;
        }
        else{
            for(int v:nums){
                if(v!=max && v!=min){
                    return v;
                }
            }
        }
        return -1;
    }
}
