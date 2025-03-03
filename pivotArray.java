//LEET. 2161. Partition Array According to Given Pivot
class pivotArray{
    public int[] pivotArray(int[] nums, int pivot) {
     int j=0,n=nums.length,pv=0;
     int []res=new int [n];   
     for(int i=0;i<n;i++){
        if(nums[i]<pivot){
            res[j++]=nums[i];
        }
        else if(nums[i]==pivot){
            pv++;
        }
     }
     for(int i=0;i<pv;i++){
            res[j++]=pivot;
        
     }for(int i=0;i<n;i++){
        if(nums[i]>pivot){
            res[j++]=nums[i];
        }
     }
     return res;
    }
}
