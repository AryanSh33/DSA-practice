//LEET 1492. The kth Factor of n

class kthFactor {
    public int kthFactor(int n, int k) {
    List<Integer>li=new ArrayList<>();
    for(int i=1;i<n/2 +1;i++){
        if(n%i==0){
            li.add(i);
        }
    }
    if(!li.contains(n)){
        li.add(n);
    }
    if(k>li.size()){
return -1;
    }
    return li.get(k-1);
    }
}
