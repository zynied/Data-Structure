
package com.nzy.leetcode.stack;

import java.util.Stack;

public class ImplementQueueUsingStacks{
    public static void main(String[] args) {
        MyQueue myQueue = new ImplementQueueUsingStacks().new MyQueue();
        Integer [] arr=new Integer[]{1,2,3,4,5};
        for (Integer integer : arr) {
            myQueue.push(integer);
            System.out.println(myQueue.pop());
        }

    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class MyQueue {
        private Stack<Integer> in;
        private Stack<Integer> out;
        /** Initialize your data structure here. */
        public MyQueue() {
            in=new Stack<>();
            out=new Stack<>();
        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            in.push(x);
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            inToOut();
            return out.pop();
        }

        /** Get the front element. */
        public int peek() {
            inToOut();
            return out.peek();
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            return in.empty()&&out.empty();
        }

        /* 将栈 in 中的数据弹出到 out中 */
        public void inToOut(){
            if (out.empty()){
                while (!in.empty()){
                    out.push(in.pop());
                }
            }
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}
