//LEET 2657. Find the Prefix Common Array of Two Arrays
class findThePrefixCommonArray {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashSet<Integer> set = new HashSet<>();
        int[] arr = new int[A.length];
        int z = 0;
        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
            z = 0;
            for (int j = 0; j <= i; j++) {
                if (set.contains(B[j])) {
                    z++;
                }
            }
            arr[i] = z;
        }
        return arr;
    }
}
