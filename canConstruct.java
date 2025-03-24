//LEET.383. Ransom Note
class canConstruct {
    public boolean canConstruct(String ransomNote, String magazine) {
        int freq[]=new int[26];
        for(int i=0;i<magazine.length();i++){
            char c=magazine.charAt(i);
            freq[c-'a']++;
        }
        for(int i=0;i<ransomNote.length();i++){
            char c=ransomNote.charAt(i);
            freq[c-'a']--;
        }
        for(int v:freq){
            if(v0){
                return false;
            }
        }
        return true;
    }
}
