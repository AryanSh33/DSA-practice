class Solution {
    public int thirdMax(int[] nums) {
        int n=nums.length;
HashSet<Integer>set=new HashSet<>();
       for(int i=0;i<n;i++){
if(!set.contains(nums[i])){

    set.add(nums[i]);
}
       }
     
       int x=set.size();
       List<Integer>li=new ArrayList<>(set);
       Collections.sort(li);
       if(x<3){
        return li.get(x-1);
       }
       return li.get(x-3);
    }
}