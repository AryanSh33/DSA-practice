class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int count=0;int []arr1=new int[26];//char freq array
        int []arr2=new int[26];
        for(int i=0;i<s1.length();i++){
            char c1=s1.charAt(i);
            char c2=s2.charAt(i);
if(c1!=c2){
    count++;//counter for swap of 2 nos
}
arr1[c1-'a']++;
arr2[c2-'a']++;
        }
        if((count==2||count==0 )&& Arrays.equals(arr1,arr2)){
            return true;
        }
        return false;
    }
}