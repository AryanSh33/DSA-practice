class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return dp(nums,target,0,0);
    }
    public int dp(int []arr,int target,int index,int sum){
        if(index>=arr.length){//runs till array
            if(sum==target){
                return 1;
            }
            else{
                return 0;
            }
        }
        int sub=dp(arr,target,index+1,sum-arr[index]);// subtraction subset of dp
        int add=dp(arr,target,index+1,sum+arr[index]);//addition set of dp
        return sub+add;
    }
}