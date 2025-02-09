//Leet. 2000. Reverse Prefix of Word
class reversePrefix{
    public String reversePrefix(String word, char ch) {
        Stack<Character>st=new Stack<>();
        int z=0;
        String s="";
        int n=word.length();
        for(int i=0;i<n;i++){
            z++;
            char c=word.charAt(i);
            if(c==ch){
                st.push(c);
                break;
            }
            else{
                st.push(c);
            }
        }
        if(z==n && word.charAt(n-1)!=ch){
            return word;
        }
        while(!st.isEmpty()){
s+=st.pop();
        }
        for(int j=z;j<n;j++){
            s+=word.charAt(j);
        }
        return s;
    }
}
