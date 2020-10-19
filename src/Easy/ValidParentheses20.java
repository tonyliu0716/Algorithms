package Easy;

import java.util.Stack;
/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
Example 4:

Input: s = "([)]"
Output: false
Example 5:

Input: s = "{[]}"
Output: true

*/
public class ValidParentheses20 {

    //  ([)]  {}
    public boolean isValid(String s) {
        
        Stack<Character> stack=new Stack<>();
        for(int i = 0;i < s.length();i++) {
            if(stack.size() >= 1){
                if(stack.peek()=='('&&s.charAt(i)==')')
                    stack.pop();
                else if(stack.peek()=='{'&&s.charAt(i)=='}')
                    stack.pop();
                else if(stack.peek()=='['&&s.charAt(i)==']')
                    stack.pop();
                else
                    stack.push(s.charAt(i));
            } else {
                stack.push(s.charAt(i));
            }
        }
        if(stack.isEmpty())
            return true;
        else
            return false;
    }
    
    
}
