class Solution {
    public int findNumbers(int[] nums) {
      int count=0;
      for(int v:nums){
        if((v>9&&v<100)||(v>999&&v<10000)||(v>99999&&v<1000000)){
            count++;
        }
      }  
      return count;
    }
}