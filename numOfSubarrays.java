//LEET 1524. Number of Sub-arrays With Odd Sum
class numOfSubarrays {
    public int numOfSubarrays(int[] arr) {
        int odd=0,even=1,res=0,sum=0;
        int mod=1000000007;
        for(int v:arr){
            sum+=v;
            if(sum%2==1){
                res=(res+even)%mod;
                odd++;
            }
            else{
                res=(res+odd)%mod;
                even++;
            }
        }
        return res;
    }
}
