class Solution {
    public int reverse(int x) {
        boolean isNegative = x < 0;
        if (isNegative) {
            x = -x;
        }
        StringBuilder s  = new StringBuilder();
        String str = Integer.toString(x);
        s.append(str);
        s.reverse();
        try {
            int reversed = Integer.parseInt(s.toString());
            return isNegative ? -reversed : reversed;
        } catch (Exception e) {
            return 0;
        }
    }
}