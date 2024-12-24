class MinimumNumberofMovestoSeatEveryone {
    public int minMovesToSeat(int[] seats, int[] students) {
      Arrays.sort(seats);
      Arrays.sort(students);
      int count=0;
      for(int i=0;i<seats.length;i++){
        int x=seats[i]-students[i];
        if(x<0){
            x=-x;
        }
        count+=x;
      }  
      return count;
    }
}
