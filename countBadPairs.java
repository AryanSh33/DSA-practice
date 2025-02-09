//BRUTE FORCE TLE
//class Solution {
//    public long countBadPairs(int[] nums) {
//     long count=0;
//     for(int i=0;i<nums.length-1;i++){
//        for(int j=i+1;j<nums.length;j++){
//            if((j-i)!=(nums[j]-nums[i])){
//                count++;
//            }
//        }
//     }   
//     return count;
//    }
//}
class countBadPairs{//Better
    public long countBadPairs(int[] nums) {
        int n=nums.length;
     long total=(long)n*(n-1)/2;
     Map<Integer,Long>diff=new HashMap<>();
     for(int i=0;i<n;i++){
       int dif=nums[i]-i;
       total-=diff.getOrDefault(dif,0L);
       diff.put(dif,diff.getOrDefault(dif,0L)+1);
     }   
     return total;
    }
}
