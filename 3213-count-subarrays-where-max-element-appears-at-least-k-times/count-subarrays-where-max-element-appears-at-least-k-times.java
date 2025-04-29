class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max=0,found=0,n=nums.length,j=0;long count=0;
        for(int v:nums){
            if(v>max){
                max=v;//find max element;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]==max){
                found++;
            }
            while(found==k){
                count+=n-i;//find no of sub arrays where condition is true;
if(nums[j]==max){
    found--;
}
j++;
            }
        }
        return count;
    }
}