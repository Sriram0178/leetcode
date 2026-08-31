class Solution {
    public int findNonMinOrMax(int[] nums) {
          int max=0;
          int min=Integer.MAX_VALUE;
          int num=0;

          for(int i=0;i<nums.length;i++){
                 min=Math.min(min,nums[i]);
                 max=Math.max(max,nums[i]);
          }
          for(int i:nums){
             if(i!=max && i!=min){
                return i;
             }
          }
          return -1;
    }
}