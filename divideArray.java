LEET .2206. Divide Array Into Equal Pairs
class divideArray {
    public boolean divideArray(int[] nums) {
        int x=0,x2=0;
        for(int i=0;i<nums.length;i++){
            int v=nums[i];
            x^=v;
            x2^=v+1;
                    }
        return x==0 && x2==0;
    }
}
