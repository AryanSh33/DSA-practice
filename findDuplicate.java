//LEET. 287. Find the Duplicate Number
class findDuplicate {
    public int findDuplicate(int[] nums) {
        Set<Integer>set=new HashSet<>();
        for(int v:nums){
            if(set.contains(v)){
                return v;
            }
            else{
                set.add(v);
            }
        }
        return -1;
    }
}
