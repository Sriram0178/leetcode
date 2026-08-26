class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        String a = "";
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int c = 0;
            StringBuilder cur = new StringBuilder();

            for (int j = i; j < n; j++) {

                cur.append(s.charAt(j));

                if (s.charAt(j) == '1') c++;

                if (c > k)   break;

                if (c == k) {
                    String curStr = cur.toString();

                    if (a.isEmpty() || curStr.length() < a.length() ||
                        (curStr.length() == a.length() && curStr.compareTo(a) < 0)) {
                        a = curStr;
                    }
                }
            }
        }
        return a;
    }
}