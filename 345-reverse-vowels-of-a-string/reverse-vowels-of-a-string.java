class Solution {
    public String reverseVowels(String s) {
        int l=0,r=s.length()-1;
         char[] a=s.toCharArray();
         String v="aeiouAEIOU";

        while(l<r){
            while(l<r && v.indexOf(a[l])==-1){
                l++;
            }
            while(l<r && v.indexOf(a[r])==-1){
                r--;
            }
            char t=a[l];
            a[l]=a[r];
            a[r]=t;

            l++;
            r--;
        }
        String ans=new String(a);
        return ans;
    }
}