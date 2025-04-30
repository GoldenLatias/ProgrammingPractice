class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += Character.getNumericValue(a.charAt(i--));
            }
            if (j >= 0) {
                sum += Character.getNumericValue(b.charAt(j--));
            }
            result.append(sum % 2);
            carry = sum / 2;
        }
        if (carry == 1) {
            result.append(1);
        }
        return result.reverse().toString();
    }
}