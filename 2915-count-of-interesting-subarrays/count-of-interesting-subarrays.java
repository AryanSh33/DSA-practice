class Solution {
    public long countInterestingSubarrays(List<Integer> nums, int mod, int k) {
        long res=0,count=0;
        Map<Integer,Long>map=new HashMap<>();
map.put(0,1L);
        for(int v:nums){
            if(v%mod==k){
                count++;
            }
            int rem=(int)(count%mod);
            int req=(rem-k+mod)%mod;
            res+=map.getOrDefault(req,0L);
            map.put(rem,map.getOrDefault(rem,0L)+1);
        
        }
        return res;
    }
}