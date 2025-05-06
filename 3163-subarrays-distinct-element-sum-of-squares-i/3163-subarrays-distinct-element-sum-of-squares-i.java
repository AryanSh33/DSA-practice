class Solution {
    public int sumCounts(List<Integer> nums) {
        int total=0,n=nums.size();
        for(int i=0;i<n;i++){
            total+=1;
            HashSet<Integer>set=new HashSet<>();
            set.add(nums.get(i));
            for(int j=i+1;j<n;j++){
set.add(nums.get(j));
total+=set.size()*set.size();
            }
        }
        return total;
    }
}