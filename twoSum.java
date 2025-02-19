// LEET 167. Two Sum II - Input Array Is Sorted
class twoSum {
    public int[] twoSum(int[] numbers, int target) {
        int r=numbers.length-1;
        int l=0;
       while(l<r){
        if(numbers[l]+numbers[r]==target){
            return new int[]{l+1,r+1};
        }
        else if(numbers[l]+numbers[r]>target){
r--;
        }
        else{
            l++;
        }
       }
       return new int[]{};
    }  
}
