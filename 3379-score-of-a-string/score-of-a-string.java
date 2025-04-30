class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
char ch=s.charAt(i);
int c1=ch;
char chh=s.charAt(i+1);
int c2=chh;
if(c1>c2){
    sum+=c1-c2;
}
else{
    sum+=c2-c1;
}

        }
        return sum;
    }
}