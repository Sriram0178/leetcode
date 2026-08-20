class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length,in=0;
        List<Integer> a=new ArrayList<>();
        List<Integer> b=new ArrayList<>();
         int arr[]=new int[n];
        a.add(nums[0]);
        b.add(nums[1]);

        for(int i=2;i<n;i++){
            int l1=a.get(a.size()-1);
            int l2=b.get(b.size()-1);

            if(l1>l2) a.add(nums[i]);
            else b.add(nums[i]);
        }
         for(int x : a){
            arr[in++]=x;
         }
         for(int x: b){
            arr[in++]=x;
         }
         return arr;
    }
}