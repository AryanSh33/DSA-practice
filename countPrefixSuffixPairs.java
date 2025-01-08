//3042. Count Prefix and Suffix Pairs I

// my optimal solution:)))
class countPrefixSuffixPairs {
    public int countPrefixSuffixPairs(String[] words) {
        int count = 0; //count of strings that satisfy the condition of prefix and suffix
        for (int i = 0; i < words.length-1; i++) {
            String s = words[i];
            for (int j = i+1; j < words.length; j++) {// i<j acc to given condition            
                    String s2 = words[j];
                    int x = 0, y = 0;//x and y are used of traversal of strings in words[i] & words[j] respectively
                    int z=0;//f
                    while (x < s.length() && y < s2.length()) {//prefix check
                        if (s.charAt(x) != s2.charAt(y)) {
                            z = 1;//if not prefix, set flag z=1 and break loop
                            break;
                        }
                        x++;
                        y++;
                    }
                    if (z == 0) {//suffix check
                        x = s.length() - 1;
                        y = s2.length() - 1;
                        while (x >= 0 && y >= 0) {
                            if (s.charAt(x) != s2.charAt(y)) {
                                z = 1;//if not suffix, break loop and set flag z=1
                                break;
                            }
                            x--;
                            y--;
                        }
                    }
                    if (z == 0) {//if prefix and suffix conditions are satisfied
                        if (s.length() <= s2.length()) {//if s is prefix or suffix of s2, it cant be greater than s2
                            count++;//incr count 
                        }
                    }
                
            }
        }
        return count;
    }
}

