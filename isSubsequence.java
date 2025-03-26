//LEET 392. Is Subsequence
class isSubsequence {
    public boolean isSubsequence(String s, String t) {
        int idx = 0;
        int end = s.length();
        for (int i = 0; i < t.length()&& idx<end; i++) {
            
            if(s.charAt(idx)==t.charAt(i)){
                idx++;
            }
        }    
        return idx==end;
    }
}
