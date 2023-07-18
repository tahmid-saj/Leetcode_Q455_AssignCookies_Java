class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int res = 0, start = 0;

        for (int i = 0; i < g.length; i++) {
            for (int j = start; j < s.length; j++) {
                if (g[i] <= s[j]) {
                    res++;
                    start++;
                    break;
                }
            }
        }

        return res;
    }
}
