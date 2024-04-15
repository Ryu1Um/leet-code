package example.valid_parentheses;

import java.util.HashMap;
import java.util.LinkedList;

public class Solution {

    public boolean isValid(String s) {
        var brackets = new HashMap<Character, Character>();
        brackets.put(')', '(');
        brackets.put(']', '[');
        brackets.put('}', '{');

        var stack = new LinkedList<>();

        for (Character c : s.toCharArray()) {
            if (brackets.containsValue(c)) {
                stack.push(c);
            } else if (brackets.containsKey(c)) {
                if (stack.isEmpty() || stack.pop() != brackets.get(c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
