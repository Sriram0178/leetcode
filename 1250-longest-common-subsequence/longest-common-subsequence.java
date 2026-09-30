class Solution {
    public int longestCommonSubsequence(String a, String b) {
         
         int[] dp=new int[a.length()];
         int l=0;

         for(char c:b.toCharArray()){
            int curr=0;
            for(int i=0;i<dp.length;i++){
                if(curr<dp[i]){
                    curr=dp[i];
                }else if(c==a.charAt(i)){
                    dp[i]=curr+1;
                    l=Math.max(l,curr+1);
                }
            }
         }
         return l;
    }
}