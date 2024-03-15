public class BalancedParentheses {

    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            if (isOpeningBracket(ch)) {
                stack.push(ch);
            } else if (isClosingBracket(ch)) {
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), ch)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isOpeningBracket(char ch) {
        return ch == '(' || ch == '{' || ch == '[';
    }

    private static boolean isClosingBracket(char ch) {
        return ch == ')' || ch == '}' || ch == ']';
    }

    private static boolean isMatchingPair(char openingBracket, char closingBracket) {
        return (openingBracket == '(' && closingBracket == ')') ||
                (openingBracket == '{' && closingBracket == '}') ||
                (openingBracket == '[' && closingBracket == ']');
    }

    public static void main(String[] args) {
        String expression1 = "({[]})";
        String expression2 = "([)]";
        String expression3 = "{[()]}";

        System.out.println(expression1 + " is balanced: " + isBalanced(expression1));
        System.out.println(expression2 + " is balanced: " + isBalanced(expression2));
        System.out.println(expression3 + " is balanced: " + isBalanced(expression3));
    }
}
