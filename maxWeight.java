//LEET. 3457. Eat Pizzas!
class  maxWeight {
    public long maxWeight(int[] pizzas) {
        Arrays.sort(pizzas);
        long ans=0;
        int n=pizzas.length;
        int k=n/4;//days
     int odd=(k+1)/2;
     int even=k-odd;
     int r=n-1;//index
     for(int i=0;i<odd;i++){
        ans+=pizzas[r--];//max odd days
     }
     for(int i=0;i<even;i++){
        r--;//max even index
        ans+=pizzas[r--];//max even days   
     }
     return ans;
    }
}
