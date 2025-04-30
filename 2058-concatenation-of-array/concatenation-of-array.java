class Solution {
    public int[] getConcatenation(int[] nums) {
        int x=2*nums.length;
        int []arr=new int [x];
        int z=0;
        for(int i=0;i<x;i++){
if(z==x/2){
    z=0;
}
arr[i]=nums[z++];
        }
        return arr;
    }
}