//LEET 3169. Count Days Without Meetings
class countDays {
    public int countDays(int days, int[][] meetings) {
        int n=meetings.length;
 Arrays.sort(meetings, (a,b)->a[0]-b[0]);
    int count=0;//no of days meeting took place
       for(int i=1;i<n;i++){
        //overlap
        if(meetings[i-1][1]>=meetings[i][0]){
        meetings[i][0]=meetings[i-1][0];
        meetings[i][1]=Math.max(meetings[i-1][1],meetings[i][1]);
        }
        else{
            count+=meetings[i-1][1]-meetings[i-1][0]+1;
        }

       }count+=meetings[n-1][1]-meetings[n-1][0]+1;

       return days-count; //total days-no of days meeting took place;
    }
}
