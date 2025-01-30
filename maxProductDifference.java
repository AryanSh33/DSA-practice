// LEET.1913. Maximum Product Difference Between Two Pairs
class maxProductDifference {
    public int maxProductDifference(int[] nums) {
     int max1=0,max2=0,n=nums.length,idx=0;
     int min1=10001,min2=10001,idx2=0;
        for(int i=0;i<n;i++){
            if(nums[i]>max1){
                max1=nums[i];
                idx=i;
            }
            if(nums[i]<min1){
                min1=nums[i];
                idx2=i;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]>max2 && i!=idx){
                max2=nums[i];
            }
            if(nums[i]<min2 && i!=idx2){
                min2=nums[i];
            }
        }
        return (max1*max2)-(min1*min2);
    }
}
