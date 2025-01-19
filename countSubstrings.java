//LEET 3084. Count Substrings Starting and Ending with Given Character
class countSubstrings {
    public long countSubstrings(String s, char c) {
        int count=0;long total=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                count++;
                total+=count;//no of permutations
            }
        }
        return total;
    }
}
