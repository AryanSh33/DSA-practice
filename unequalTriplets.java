//LEET. 2475. Number of Unequal Triplets in Array
class Solution {
    public int unequalTriplets(int[] nums) {
        int n=nums.length,count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
if(nums[i]!=nums[j] && nums[j]!=nums[k] && nums[k]!=nums[i]){
    count++;
}
                }
            }
        }
        return count;
    }
}
