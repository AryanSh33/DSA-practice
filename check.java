//LEET.1752. Check if Array Is Sorted and Rotated
class check {
    public boolean check(int[] nums) {
     int count=0;
     int first=nums[0],last=nums[nums.length-1];
     for(int i=0;i<nums.length-1;i++){
if(nums[i]>nums[i+1]){
    count++;
}
if(count==2){
    return false;
}
     }   
     if(count==1){
        if(first>=last){
            return true;
        }
        else{
            return false;
        }
     }
     return true;
    }
}
