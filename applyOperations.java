//LEET 2460. Apply Operations to an Array
class applyOperations{
    public int[] applyOperations(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]*=2;
                nums[i+1]=0;
            }
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==0){
                  for(int j=i+1;j<nums.length;j++){
            if(nums[j]!=0){
                nums[i]=nums[j];
                nums[j]=0;
                break; 
            }
            }
            }
        }
        return nums;
    }
}
