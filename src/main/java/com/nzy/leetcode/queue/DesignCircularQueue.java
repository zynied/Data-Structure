package com.nzy.leetcode.queue;
/*622*/
public class DesignCircularQueue {
    public static void main(String[] args) {
       new DesignCircularQueue().test();
    }
    public void test(){
        Solution circularQueue = new DesignCircularQueue().new Solution(3);
        circularQueue.enQueue(1);  // 返回 true
        circularQueue.enQueue(2);  // 返回 true
        circularQueue.enQueue(3);  // 返回 true
        circularQueue.enQueue(4);  // 返回 false，队列已满
        circularQueue.Rear();  // 返回 3
        circularQueue.isFull();  // 返回 true
        circularQueue.deQueue();  // 返回 true
        circularQueue.enQueue(4);  // 返回 true
        circularQueue.Rear();  // 返回 4
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    /*
        执行耗时:7 ms,击败了48.02% 的Java用户
        内存消耗:39.2 MB,击败了78.59% 的Java用户
     */
    class Solution {
        private int k;//队列大小
        private int head;//队列的头指针
        private int tail;//队列的尾指针
        private int count;//当前队列有效元素的个数
        private Integer queue[];//存放队列数据的数组

        public Solution() {
            k=24;
            head=0;
            tail=0;
            count=0;
            queue=new Integer[k];
        }
        /** Initialize your data structure here. Set the size of the queue to be k. */
        public Solution(int k) {
            this.k=k;
            head=0;
            tail=0;
            count=0;
            queue=new Integer[this.k];
        }

        /** Insert an element into the circular queue. Return true if the operation is successful. */
        public boolean enQueue(int value) {
            if (isFull())return false;
            queue[tail]=value;
            count++;
            tail=tail==queue.length-1?0:tail+1;
            return true;
        }

        /** Delete an element from the circular queue. Return true if the operation is successful. */
        public boolean deQueue() {
            if (isEmpty())return false;
            head=head==queue.length-1?0:head+1;
            count--;
            return true;
        }

        /** Get the front item from the queue. */
        public int Front() {
            if (isEmpty())return -1;
            return queue[head];
        }

        /** Get the last item from the queue. */
        public int Rear() {
            if (isEmpty())return -1;
            return tail==0?queue[queue.length-1]:queue[tail-1];
        }

        /** Checks whether the circular queue is empty or not. */
        public boolean isEmpty() {
            return count==0;
        }

        /** Checks whether the circular queue is full or not. */
        public boolean isFull() {
           return count==queue.length;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
