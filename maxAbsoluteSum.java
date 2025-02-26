class maxAbsoluteSum{
    public int maxAbsoluteSum(int[] nums) {
        int minSum=0,maxSum=0;
        for(int v:nums){
        maxSum=Math.max(0,maxSum+v);//Kadane's Algorithm
        minSum=Math.min(0,minSum+v);
        }
        return maxSum-minSum;
        }
        }
