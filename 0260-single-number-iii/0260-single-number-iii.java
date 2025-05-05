class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        List<Integer>li=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                map.put(nums[i],2);
            }
        }
        for(int x:map.keySet()){
         if(map.get(x)==1){
li.add(x);
         }}
         int  []arr=new int[li.size()];
         for(int i=0;i<li.size();i++){
            arr[i]=li.get(i);
         }
        
        return arr;
    }
}