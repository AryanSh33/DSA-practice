//2471. Minimum Number of Operations to Sort a Binary Tree by Level
class BinaryTreeSortMinOperation {
    public int minimumOperations(TreeNode root) {
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        int count=0;
        while(!q.isEmpty()){
TreeNode cur=q.peek();// traveresing the tree and filling the Queue 
int size=q.size();
for(int i=0;i<size;i++){
    cur=q.remove();
    if(cur.left!=null){
        q.add(cur.left);
    }
    if(cur.right!=null){
        q.add(cur.right);
    }
}
int []arr=new int [q.size()];
int k=0;
for(TreeNode num :q){
    arr[k++]=num.val;//switching from queue to array to find the min swaps with lil ease
}
count+=minSwaps(arr,k);//calling the min swap fn
        }
        return count;
    }
    public int minSwaps(int []arr,int n){//if array isnt sorted, 
    int ans=0;                       //min no. of swaps=no. of elementes not persent at their proper position
    int []temp=Arrays.copyOfRange(arr,0,n);
    Arrays.sort(temp);
    for(int i=0;i<n;i++){
        if(arr[i]!=temp[i]){
            ans++;
            swap(arr,i,indexOf(arr,temp[i]));//swapping index to avoid double counting while swapping 
        }                                 //i.e   a<->b count woud be 2, so we swap to avoid counting it twice
    }
    return ans;
    }
    public void swap(int []arr,int i,int j){//swap element of the arrray
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public int indexOf(int []arr,int element){ //determine the index of the array
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element){
                return i;
            }
        }
        return -1;
    }
}
