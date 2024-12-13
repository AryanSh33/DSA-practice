//2593. Find Score of an Array After Marking All Elements
class FindArrayScore {
    public long findScore(int[] nums) {
        int n=nums.length;
        long score=0;
        for(int i=0;i<n;i++){
            long odd=0,even=0;
            for(int val=nums[i];i+1<n && nums[i]>nums[i+1];i++,val=nums[i]){//select next global minimum 
                if(i%2==0){
                    even+=val;
                }
                else{
                    odd+=val;
                }
            }
            if(i%2==0){
                score+=even;
            }
            else{
                score+=odd;
            }
            score+=nums[i];
            i++;//for doing i+=2;
        }
        return score;
    }
}
