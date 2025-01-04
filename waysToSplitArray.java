//LEET 2270
class waysToSplitArray{
    public int waysToSplitArray(int[] nums) {
        long sum1=0, sum2=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
sum2+=nums[i];//sum of right split(right sum)
        }
        for(int i=0;i<nums.length-1;i++){
            sum1+=nums[i];//sum of left split(left sum)
            sum2-=nums[i];
            if(sum1>=sum2){
                count++; //when leftsum of i+1 >= rightsum
            }
        }
        return count;
    }
}
