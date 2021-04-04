public class KnapsackBottomUp {

    static int W = 10;
    static int[] wt = {5,4,6,3};
    static int[] val = {10,40,30,50};
    public static void main(String[] args) {
        int n = wt.length;
        int[][] mat = new int[n+1][W+1];
        for(int i = 0; i <= W; i++)
        mat[0][i] = 0;
        for(int i = 0; i <= n; i++)
        mat[i][0] = 0;

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= W; j++) {
                //if weight of i'th item is less than or equal to knapsack capacity
                //only then does it make sense to attempt to add this item
                if(wt[i - 1] <= j)
                mat[i][j] = Math.max(mat[i - 1][j], val[i - 1] + mat[i - 1][j - wt[i - 1]]);
                else
                mat[i][j] = mat[i - 1][j];
            }
        }
        System.out.println("Max value of knapsack is: " + mat[n][W]);
    }
}