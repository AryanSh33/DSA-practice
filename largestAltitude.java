class Solution {
    public int largestAltitude(int[] gain) {
        int alt=0;
        int sum=0;
        for(int i=0;i<gain.length;i++){
            sum+=gain[i];
            alt=Math.max(sum,alt);
        }
        return alt;
    }
}
