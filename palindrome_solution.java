class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        StringBuilder s = new StringBuilder();
        String str = Integer.toString(x);
        if (s.append(str).reverse().toString().equals(str)) {
            return true;
        } else {
            return false;
        }
    }
}