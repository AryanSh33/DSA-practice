//LEET.2545. Sort the Students by Their Kth Score

class sortTheStudents {
    public int[][] sortTheStudents(int[][] score, int k) {
        int []arr=new int [score.length];
        for(int i=0;i<score.length;i++){
arr[i]=score[i][k];
        }
        Arrays.sort(arr);
        List<Integer>li=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<score.length;j++){
                if(arr[i]==score[j][k]){
                    li.add(j);
                    break;
                }
            }
        }
        int [][]arr1=new int [score.length][score[0].length];
        int j=score.length-1;
        for(int v:li){
            for(int i=0;i<score[0].length;i++){
               arr1[j][i]=score[v][i]; 
            }
            j--;
        }
        return arr1;
    }
}
