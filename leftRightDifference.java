class leftRightDifference {
    public int[] leftRightDifference(int[] nums) {
        int m=nums.length;
        int []ls=new int[m];
        int []rs=new int[m];
        int j=m-1;
        int left=0;
        int right=0;
        for(int i=0;i<m;i++){
ls[i]=left;
left+=nums[i];
rs[j]=right;
right+=nums[j];
j--;
        }
        for(int i=0;i<m;i++){
            nums[i]=Math.abs(ls[i]-rs[i]);
        }
        return nums;
    }
}
