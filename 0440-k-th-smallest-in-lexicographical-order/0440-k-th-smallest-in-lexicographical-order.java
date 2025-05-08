class Solution {
    public int findKthNumber(int n, int k) {
        int cur=1;
        k--;
        while(k>0){
            int count=countNum(cur,n);
            if(k>=count){
                ++cur;
                k=k-count;
            }
            else{
                cur*=10;
                k--;
            }
        }
        return cur;
    }
    int countNum(int cur,int n){
        long firstNum=cur,nextNum=cur+1;
        int totalCount=0;
        while(firstNum<=n){
            totalCount+=Math.min(n+1,nextNum)-firstNum;
            firstNum*=10;
            nextNum*=10;
        }
        return totalCount;
    }

}