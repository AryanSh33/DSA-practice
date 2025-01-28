//BRUTE FORCE
//LEET.2418. Sort the People
class sortPeople{
    public String[] sortPeople(String[] names, int[] heights) {
        int n=heights.length;
        int []arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=heights[i];
        }
        Arrays.sort(arr);
        List<Integer>li=new ArrayList<>();
        for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
    if(arr[i]==heights[j]){
        li.add(j);
        break;
    }
}
        }
        String []names2=new String[n];
        int x=n-1;
        for(int v:li){
            names2[x--]=names[v];
        }
       return names2;
    }
}
