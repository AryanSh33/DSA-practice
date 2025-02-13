//LEET 1991. Find the Middle Index in Array
class findMiddleIndex{
    public int findMiddleIndex(int[] nums) {
        int n=nums.length;
        int left=0;int right=0;
        for(int v:nums){
            right+=v;
        }
        for(int i=0;i<n;i++){

right-=nums[i];
if(left==right){
    return i;
}
left+=nums[i];
        }
        return -1;
    }
}
