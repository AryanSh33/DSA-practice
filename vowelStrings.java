class vowelStrings {
    public int[] vowelStrings(String[] words, int[][] queries) {
        Set<Character> vowels = Set.of('a','e','i','o','u');
        int[] pre = new int[words.length+1];
        for(int i=0;i<words.length;i++) {
            String word = words[i];
            if(vowels.contains(word.charAt(0))&&vowels.contains(word.charAt(word.length()-1))) {
                pre[i+1]=pre[i]+1;
            } else {
                pre[i+1]=pre[i];
            }
        }
        int[] res = new int[queries.length];
        for(int i=0;i<queries.length;i++) {
            int l=queries[i][0],r=queries[i][1];
            res[i]=pre[r+1]-pre[l];
        }
        return res;
    }
}
