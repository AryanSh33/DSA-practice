class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int min=arrays.get(0).get(0);
        int max=arrays.get(0).get(arrays.get(0).size()-1);
        int distance=0;
for(int i=1;i<arrays.size();i++){
distance=Math.max(distance,Math.abs(arrays.get(i).get(0)-max));
distance=Math.max(distance,Math.abs(arrays.get(i).get(arrays.get(i).size()-1)-min));
max=Math.max(max,arrays.get(i).get(arrays.get(i).size()-1));
min=Math.min(min,arrays.get(i).get(0));
}return distance;
    }
}