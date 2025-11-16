class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        // For loop that goes through the first digit and so on for each character
        String prefix = "";
        char letter;

        for (int i = 0; i < strs.length; i++) {
            int j = 1;
            letter = strs[i].charAt(i);
            String nextWord = strs[j];

            if (letter == nextWord.charAt(i)) {

                prefix = prefix + letter;
                j++;
                continue;
            }
            else {
                break;
            }


        }
        return prefix;
        
    }
}
