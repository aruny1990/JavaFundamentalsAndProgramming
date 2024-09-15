package LeetCode;

public class RemoveOuterParanthesis {

	public static String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int openBrackets = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (openBrackets > 0) {
                    result.append(c);
                }
                openBrackets++;
            } else if (c == ')') {
                openBrackets--;
                if (openBrackets > 0) {
                    result.append(c);
                }
            }
        }

        return result.toString();
    }
	
	public static void main(String[] args) {
        // Example 1
        String s1 = "(()())(())";
        System.out.println(removeOuterParentheses(s1)); // Output: "()()()"

        // Example 2
        String s2 = "(()())(())(()(()))";
        System.out.println(removeOuterParentheses(s2)); // Output: "()()()()(())"

        // Example 3
        String s3 = "()()";
        System.out.println(removeOuterParentheses(s3)); // Output: ""
    }
	
}
