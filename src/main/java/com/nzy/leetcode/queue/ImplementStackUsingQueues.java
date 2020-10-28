package com.nzy.leetcode.queue;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues{
    public static void main(String[] args) {
        MyStack myStack = new ImplementStackUsingQueues().new MyStack();
        Integer arr[]=new Integer[]{1,2,3,4};
        for (Integer i : arr) {
            myStack.push(i);
        }
        while (!myStack.empty()){
            System.out.println(myStack.pop());
        }
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class MyStack {
        private Queue<Integer> queue;
        /** Initialize your data structure here. */
        public MyStack() {
            queue=new LinkedList<>();
        }

        /** Push element x onto stack. */
        public void push(int x) {
            queue.offer(x);
            int count=queue.size()-1;
            for (int i=1;i<=count;i++){
                queue.offer(queue.poll());
            }
        }

        /** Removes the element on top of the stack and returns that element. */
        public int pop() {
            return queue.poll();
        }

        /** Get the top element. */
        public int top() {
            return queue.peek();
        }

        /** Returns whether the stack is empty. */
        public boolean empty() {
            return queue.isEmpty();
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}
