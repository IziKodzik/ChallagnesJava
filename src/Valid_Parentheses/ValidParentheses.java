package Valid_Parentheses;

import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String string){

        Stack<Character> stack = new Stack<>();
        String someString = "(){]}";
        for (int i = 0; i < someString.length(); ++i) {
            char l = someString.charAt(i);
            if(l == '(' || l == '{' || l == '[')
                stack.push(l);
            else{
                if(stack.size() < 1)
                    return false;
                Character pop = stack.pop();
                switch (pop) {
                    case '(':
                        if (l != ')')
                            return false;
                        break;
                    case '{':
                        if (l != '}')
                            return false;
                        break;
                    case '[':
                        if (l != ']')
                            return false;
                        break;
                }
            }
        }
        return stack.size() == 0;

    }

    public static void main(String[] args) {
        System.out.println(isValid("tf"));
    }

}
