//Leet 2828. Check if a String Is an Acronym of Words


class Solution {
    public boolean isAcronym(List<String> words, String s) {
        if(s.length()!=words.size()) return false;
        int x=0;
        for(String ss:words){
if(ss.charAt(0)!=s.charAt(x)){
    return false;
}
x++;
        }
        return true;
    }
}
