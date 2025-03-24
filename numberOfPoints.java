//LEET. 2848. Points That Intersect With Cars
class numberOfPoints{
    public int numberOfPoints(List<List<Integer>> nums) {
        int count=0,cur=0;
        nums.sort(Comparator.comparing(list->list.get(0)));
        for(List<Integer>n:nums){
            if(cur<n.get(0)){
                count+=n.get(1)-n.get(0)+1;

            }
            else if(n.get(1)>cur){
                count+=n.get(1)-cur;
            }
            cur=Math.max(cur,n.get(1));
        }
        return count;
    }
}
