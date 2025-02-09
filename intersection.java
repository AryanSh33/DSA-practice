//LEET 349. Intersection of Two Arrays
class intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>h1=new HashSet<>();
        HashSet<Integer>h2=new HashSet<>();
        
        for(int v:nums1){
            h1.add(v);
        }
        for(int v:nums2){
            if(h1.contains(v)){
                h2.add(v);
            }
        }
        int n=h2.size();
        int []res=new int[n];
        n=0;
        for(int v:h2){
res[n++]=v;
        }
        return res;
    }
}
