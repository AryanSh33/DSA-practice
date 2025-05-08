class Solution {
    public int findComplement(int num) {
        if(num==0){return 1;}
        else if(num==1){return 0;}
          String s=Integer.toBinaryString(num);
          String a="";
      for( int i=0;i<s.length();i++){
if(s.charAt(i)=='0'){
    a+="1";
}
else{
    a+="0";
}
      }
     
      int b=Integer.parseInt(a,2); 
      return b;
    }
}