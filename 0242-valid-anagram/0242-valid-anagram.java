class Solution {
    public boolean isAnagram(String s, String t) {
        int freq[]=new int [26];
        if(s.length()!=t.length()){
            return false;
        }
        
        for(int i=0;i<s.length();i++){
           char c=s.charAt(i),c2=t.charAt(i);
           
           freq[c-'a']++;
           freq[c2-'a']--;
        }
        for(int v:freq){
            if(v!=0){
                return false;
            }
        }
        return true;
    }
}