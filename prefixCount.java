//LEET 2185. Counting Words With a Given Prefix
class prefixCount {
    public int prefixCount(String[] words, String pref) {
        int count=0;
        for(int i=0;i<words.length;i++){
            String s=words[i];
            if(s.startsWith(pref)){
                count++;
            }
        }return count;
    }
}
//similar questions
//class Solution {
//    public int countPrefixes(String[] words, String s) {
 //       int count=0;
 //       for(int i=0;i<words.length;i++){
 //           String s1=words[i];
 //           if(s.startsWith(s1)){
 //               count++;
  //          }
//        }
//        return count;
//    }
//}
