class LargestOddNumberInString {
    public String largestOddNumber(String num) {
        String s="";
        int x=-1;
for(int i=num.length()-1;i>=0;i--){
    char c=num.charAt(i);
    if(checker(c)){
        x=i; break;
    }
}
if(x>-1){
    for(int i=0;i<=x;i++){
        s+=num.charAt(i);
    }
}
return s;
    }
    public boolean checker(char c){
if(c=='1'||c=='3'||c=='5'||c=='7'||c=='9'){
    return true;
}
return false;
    }
}
