package com.nzy.datastructure.queue;

import java.lang.reflect.Array;

public class ImplementCycleQueueUsingArray {
    public static void main(String[] args) {
        Solution solution = new ImplementCycleQueueUsingArray().new Solution(Integer.class);
        solution.offer(1);
        System.out.println(solution.peek());
    }
    class Solution<T>{
        private int length;//队列长度
        private int head;//头指针
        private int tail;//尾指针
        private T[] queue;//用来存放队列数据的数组

        public Solution(Class<T> type) {
            length=1024;
            head=0;
            tail=0;
            queue=(T[]) Array.newInstance(type,length);
        }
        public Solution(Class<T> type,int length) {
            this.length = length;
            head=0;
            tail=0;
            queue=(T[]) Array.newInstance(type,this.length);
        }
        /* 判断队列是否为空 */
        public boolean isEmpty(){return head==tail;}
        /* 判断队列是否为满 */
        public boolean isFull(){return (tail+1)%length==head;}
        /* 入队 */
        public void offer(T data){
            if (isFull()){
                throw new RuntimeException("队列已满,入队失败!");
            }
            queue[tail]=data;
            tail=(tail+1)%length;
        }
        /* 出队 */
        public T poll(){
            if (isEmpty()){
                throw new RuntimeException("队列为空,出队失败!");
            }
            T temp=queue[head];
            head=(head+1)%length;
            return temp;
        }
        /* 返回队列头元素 */
        public T peek(){
            if (isEmpty()){
                throw new RuntimeException("队列为空,出队失败!");
            }
            return queue[head];
        }
    }
}
