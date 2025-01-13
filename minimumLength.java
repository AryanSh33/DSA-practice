//leet 3223. Minimum Length of String After Operations

class minimumLength {
    public int minimumLength(String s) {
        int res=0;
        int[]arr=new int[26];//frequency
        for(char c:s.toCharArray()){
            arr[c-'a']++;
        }
        for(int i:arr){
            if(i==0){// skips if a char doesnt occur
                continue;
            }
            if(i%2==0){
                res+=2;// even freq... 2 char can be removed
            }
            else{
                res+=1;//if odd freq one char stays
            }
        }
        return res;

    }
}
