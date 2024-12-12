class Solution2558 {
    public long pickGifts(int[] gifts, int k) {
       int x=gifts.length-1;
       while(k!=0){
        Arrays.sort(gifts);
        gifts[x]=(int)Math.floor(Math.sqrt(gifts[x]));
        k--;
       } 
       long sum=0;
       for(int i=0;i<=x;i++){
        sum+=gifts[i];
       }
       return sum;
    }
}
