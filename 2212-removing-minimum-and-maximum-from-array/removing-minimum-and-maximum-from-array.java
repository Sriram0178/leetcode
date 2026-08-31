class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;

        int min = 0, max= 0;

        for(int i = 0; i < n; i++){
            if(nums[i] < nums[min]) min= i;
            if(nums[i] > nums[max]) max = i;
        }

        int l = Math.min(min, max);
        int r = Math.max(min, max);

        int f = r + 1;

        int b = n - l;

        int fb = (l + 1) + (n - r);

        return Math.min(f, Math.min(b, fb));
    }
}