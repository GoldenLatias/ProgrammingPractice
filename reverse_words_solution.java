class Solution {
    public String reverseWords(String s) {
        String[] wordsArray = s.trim().split("\\s+");
        StringBuilder returnword = new StringBuilder();
        for (int i = wordsArray.length - 1; i >= 0; i--) {
            returnword.append(wordsArray[i]).append(" ");
        }
        return returnword.toString().trim();
    }
}