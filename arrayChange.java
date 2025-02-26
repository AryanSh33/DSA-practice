//2295. Replace Elements in an Array
class arrayChange {
    public int[] arrayChange(int[] nums, int[][] operations) {
       // for(int i=0;i<operations.length;i++){
         //   for(int j=0;j<nums.length;j++){
           //     if(nums[j]==operations[i][0]){
             //       nums[j]=operations[i][1];
           //     }
           // }
        //}
        //return nums;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int []v:operations){
            nums[map.get(v[0])]=v[1];
            map.put(v[1],map.get(v[0]));
        }
        return nums;
    }
}
