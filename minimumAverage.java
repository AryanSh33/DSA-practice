//Leet.3194. Minimum Average of Smallest and Largest Elements
class minimumAverage{
    public double minimumAverage(int[] nums) {
        List<Double>li=new ArrayList<>();
        Arrays.sort(nums);
        int i=0,j=nums.length-1;
        while(i<j){
            double a=(double)(nums[i]+nums[j])/2;
            li.add(a);
            i++;
            j--;
        }
        Collections.sort(li);
        return li.get(0);
    }
}
