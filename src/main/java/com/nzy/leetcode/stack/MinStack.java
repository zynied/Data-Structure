package com.nzy.leetcode.stack;

import java.util.Stack;

public class MinStack{
    public static void main(String[] args) {
        MinsStack minStack = new MinStack().new MinsStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println("返回-3 --> "+minStack.getMin());
        minStack.pop();
        System.out.println("返回0 --> "+minStack.top());
        System.out.println("返回-2 --> "+minStack.getMin());
    }
//leetcode submit region begin(Prohibit modification and deletion)
    class MinsStack {
        private Stack<Integer> stack;
        private Stack<Integer> minStack;

        /** initialize your data structure here. */
        public MinsStack() {
            stack=new Stack<>();
            minStack=new Stack<>();
        }

        public void push(int x) {
            stack.push(x);
            if (!minStack.empty()){
                if (x<minStack.peek())minStack.push(x);
            }else {
                minStack.push(x);
            }
        }

        public void pop() {
            Integer pop = stack.pop();
            if (pop==minStack.peek())minStack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}
