class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> s=new HashSet<>();
        int c=k;
        for(int n:nums) s.add(n);
        
        for(int i=0;i<nums.length;i++){
            if(s.contains(c)){
                c+=k;
            }
        }
        return c;
    }
}