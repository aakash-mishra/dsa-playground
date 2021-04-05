public class KnapsackSpaceOptimized {
    static int W = 10;
    static int[] wt = {5,4,6,3};
    static int[] val = {10,40,30,50};
    public static void main(String[] args) {
        int n = wt.length;
        int[] mat = new int[W + 1];
        
        for(int i = 0; i < n; i++) {
            for(int j = W; j >= 1; j--) {
                //weight of this item (w[i]) should be less than or equal to
                //the current knapsack capacity (j)
                if(wt[i] <= j)
                mat[j] = Math.max(mat[j], mat[j - wt[i]] + val[i]);
            }
        }
        System.out.println("Max value of knapsack is: " + mat[W]);
    }
}
