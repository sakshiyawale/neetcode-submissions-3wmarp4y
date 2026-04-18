class Solution {
    public String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);
        int i = 0;
        String prefix = "";

        while (i < strs[0].length()){
            if (strs[0].charAt(i) == strs[strs.length - 1].charAt(i)){
                prefix = prefix + strs[0].charAt(i);
                i++;
            } else {
                break;
            }
        }

        return prefix;
    }
}