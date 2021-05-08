public class LongestCommonSubsequence {
    public static void main(String[] args) {
        //Subsequence does not have to be contiguous
        String s1 = "abcdaf";
        String s2 = "acbcf";
        //So the longest common subsequence in above two strings would be - "abcf"

        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        for(int i = 1; i <= c1.length; i++) {
            for(int j = 1; j <= c2.length; j++) {
                if(c1[i - 1] == c2[j - 1])
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        System.out.println("Length of longest common subsequence is: " + dp[c1.length][c2.length]);
    }
    
}
