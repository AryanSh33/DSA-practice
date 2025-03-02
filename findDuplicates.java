//LEET 442. Find All Duplicates in an Array
class findDuplicates{
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer>set1=new HashSet<>();
        HashSet<Integer>set2=new HashSet<>();
        for(int v:nums){
if(set1.contains(v)){
    set2.add(v);
}
else{
    set1.add(v);
}

        }
        List<Integer>li=new ArrayList<>(set2);
        return li;
    }
}
