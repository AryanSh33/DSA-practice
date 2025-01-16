//LEET.2425. Bitwise XOR of All Pairings
class xorAllNums {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int k=0;int []nums3=new int[nums1.length*nums2.length];
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                nums3[k++]=nums1[i]^nums2[j];
            }
        }
        int x=0^0;
        for(int i=0;i<nums3.length-1;i++){
x=nums3[i]^nums3[i+1];
        }
        return x;
    }
}
