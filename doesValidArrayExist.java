class doesValidArrayExist {
    public boolean doesValidArrayExist(int[] derived) {
        int x=0;//x^x=0 && x^0=x{
        //all terms between them would be cancelled out acc to the given condition
       // }
        for(int i=0;i<derived.length;i++){
            x=derived[i]^x;
        }
        return x==0;
    }
}
