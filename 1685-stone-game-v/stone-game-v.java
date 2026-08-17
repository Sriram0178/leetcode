class Solution {
    public int stoneGameV(int[] s) {
        int n = s.length;

        if(n == 1) return 0;

        int[] p = new int[n+1];

        for(int i = 0; i<n; i++){
            p[i+1] = p[i] + s[i];
        }

        int[][] dp = new int[n][n];

        for(int l = 2; l<=n; l++){
            for(int i = 0; i + l - 1<n; i++){
                int j = i + l- 1;
                int best = 0;
                int curr;
                for(int k = i; k<j; k++){
                    int left = p[k+1] - p[i];
                    int right = p[j+1] - p[k+1];
                    
                    if(left < right){
                        curr = left + dp[i][k];
                    }else if(left > right){
                        curr = right + dp[k+1][j];
                    }else{
                        curr = left + Math.max(dp[i][k], dp[k+1][j]);
                    }
                    best = Math.max(best, curr);
                }

                dp[i][j] = best;
            }
        }

        return dp[0][n-1];
    }
}