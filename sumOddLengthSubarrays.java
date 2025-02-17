//LEET 1588. Sum of All Odd Length Subarrays

class sumOddLengthSubarrays {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum=0,n=arr.length;
        for(int i=0;i<n;i++){
            int count=1;int summ=0;
            for(int j=i;j<n;j++){         
                summ+=arr[j];
if(count%2==1){
    sum+=summ;
}count++;
            }
        }
        return sum;
    }
}
