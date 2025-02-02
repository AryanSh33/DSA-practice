//LEET 2124. Check if All A's Appears Before All B's
class  checkString {
    public boolean checkString(String s) { char c=s.charAt(0);
    for(int i=0;i<s.length()-1;i++){
char v=s.charAt(i+1);
if(c=='b'&& v=='a'){
    return false;
}
c=v;
    }
    return true;
    }
}
