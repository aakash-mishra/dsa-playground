public class NegativeIn2D {
    public static void main(String[] args) {
        //3x4 matrix
        // int[][] nums = {{4,2,1,-1}, {3, 1, -2, -3}, {2, -4, -5, -6}};
        int[][] nums = {{4,3,2,-1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1,-1,-2,-3}};
        int row = 0;
        int cnt = 0;
        int col = nums[0].length - 1;
        while(col >= 0) {
            if(row == nums.length) col --;
            else if(nums[row][col] < 0) {
                cnt += nums.length - row;
                col--;
            }
            else {
                row++;
            }
        }
        System.out.println(cnt);
    }
}
