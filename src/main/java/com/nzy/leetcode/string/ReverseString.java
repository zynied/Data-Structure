package com.nzy.leetcode.string;

public class ReverseString{
    public static void main(String[] args) {
        Solution solution = new ReverseString().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void reverseString(char[] s) {
            //recursive(s,0,s.length-1);
            /*双指针法*/
            int left=0;
            int right=s.length-1;
            while (left<right){
                char temp=s[left];
                s[left]=s[right];
                s[right]=temp;
                left++;
                right--;
            }
        }
        /*递归法*/
        private void recursive(char [] s,int left,int right){
            if (left>=right)return;
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
            recursive(s,left,right);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
