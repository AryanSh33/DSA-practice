//LEET. 1833. Maximum Ice Cream Bars
class maxIceCream {
    public int maxIceCream(int[] costs, int coins) {
        int count=0,n=costs.length;
        Arrays.sort(costs);
        for(int i=0;i<n;i++){
            if(costs[i]<=coins){
                coins-=costs[i];
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }
}
