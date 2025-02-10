//LEET. 3174. Clear Digits
class clearDigits {
    public String clearDigits(String s) {
        Stack<Character>st=new Stack<>();

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
if(c>='a'&&c<='z'){
    st.push(c);
}
else{
    if(!st.isEmpty()){
        st.pop();
    }
}}
String temp="";
while(!st.isEmpty()){
    temp+=st.pop();
}
String res="";
for(int i=temp.length()-1;i>=0;i--){
res+=temp.charAt(i);
}
        
        return res;
    }
}
