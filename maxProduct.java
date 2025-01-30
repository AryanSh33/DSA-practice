//LEET.1464. Maximum Product of Two Elements in an Array
class maxProduct {
    public int maxProduct(int[] nums) {
        int max1=0,max2=0,n=nums.length,idx=0;
        for(int i=0;i<n;i++){
            if(nums[i]>max1){
                max1=nums[i];
                idx=i;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]>max2 && i!=idx){
                max2=nums[i];
            }
        }
        return (max1-1)*(max2-1);
    }
}
