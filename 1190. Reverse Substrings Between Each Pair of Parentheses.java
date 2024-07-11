import java.util.Stack;

public class ReverseSubstrings {
    public String reverseParentheses(String s) {
        Stack<StringBuilder> stack = new Stack<>();
        StringBuilder current = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(current);
                current = new StringBuilder();
            } else if (c == ')') {
                current.reverse();
                current = stack.pop().append(current);
            } else {
                current.append(c);
            }
        }
        
        return current.toString();
    }

    public static void main(String[] args) {
        ReverseSubstrings solution = new ReverseSubstrings();
        String s = "(abcd)";
        System.out.println(solution.reverseParentheses(s)); // Output: "dcba"
    }
}
