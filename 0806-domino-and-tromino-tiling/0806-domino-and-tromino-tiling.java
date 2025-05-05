class Solution {
    public int numTilings(int n) {
        if(n<=2){
            return n;
        }
        int mod=1000000007;
        long []full=new long[n+1];long part[]=new long[n+1];
        full[1]=1;full[2]=2;
        part[1]=0;part[2]=1;
        for(int i=3;i<=n;i++){
            full[i]=(full[i-1]+full[i-2]+2*part[i-1])%mod;
            part[i]=(part[i-1]+full[i-2])%mod;
        }
        return (int)(full[n]);
    }
}