class Solution {
    public String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);
        int i = 0;
        StringBuilder prefix = new StringBuilder();

        while (i < strs[0].length()){
            if (strs[0].charAt(i) == strs[strs.length - 1].charAt(i)){
                prefix.append(strs[0].charAt(i));
                i++;
            } else {
                break;
            }
        }

        return prefix.toString();
    }
}