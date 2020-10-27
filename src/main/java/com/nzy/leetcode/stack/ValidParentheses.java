package com.nzy.leetcode.stack;

import java.util.Stack;

public class ValidParentheses{
    public static void main(String[] args) {
        Solution solution = new ValidParentheses().new Solution();
        String str="{}[](";
        System.out.println(solution.isValid(str) ? "有效" : "无效");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isValid(String s) {
            if(s.isEmpty())return true;
            Stack<Character> stack=new Stack();
            for (char c : s.toCharArray()) {
                if (c=='(')stack.push(')');
                else if(c=='[')stack.push(']');
                else if(c=='{')stack.push('}');
                else if(stack.empty())return false;
                else if(c!=stack.pop())return false;
            }
            return stack.empty();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)
}
