class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> ints = new Stack<>();
        for (String token: tokens) {
            if (token.equals("+")) {
                int b = ints.pop();
                int a = ints.pop();
                ints.push(a+b);
            } else if (token.equals("-")) {
                int b = ints.pop();
                int a = ints.pop();
                ints.push(a-b);
            } else if (token.equals("*")) {
                int b = ints.pop();
                int a = ints.pop();
                ints.push(a*b);
            } else if (token.equals("/")) {
                int b = ints.pop();
                int a = ints.pop();
                ints.push(a/b);
            } else {
                ints.push(Integer.parseInt(token));
            }
        }
        return ints.pop();
    }
}