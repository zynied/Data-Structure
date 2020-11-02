package com.nzy.leetcode.array;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class MissingNumber{
    public static void main(String[] args) {
        Solution solution = new MissingNumber().new Solution();
        System.out.println(solution.missingNumber(new int[]{0, 1, 2}));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int missingNumber(int[] nums) {
            //1.排序
            /*时间复杂度:O(n*logn),空间复杂度:O()*/
            /*执行耗时:6 ms,内存消耗:39 MB*/
/*            Arrays.sort(nums);
            for (int i=0;i<nums.length;i++){
                if (nums[i]!=i)return i;
            }
            return nums.length;*/
            //2.Set
            /*时间复杂度:O(n),空间复杂度:O()*/
            /*LinkedHashSet 执行耗时:13 ms,内存消耗:39.3 MB*/
            /*HashSet 执行耗时:7 ms,内存消耗:38.9 MB*/
            Set<Integer> in=new LinkedHashSet<>();
            for (int i=0;i<nums.length;i++){
                in.add(nums[i]);
            }
            for (int i=0;i<nums.length;i++){
                if (!in.contains(i))return i;
            }
            return nums.length;
            //3.直接计算
            /*时间复杂度:O(n),空间复杂度:O()*/
            /*执行耗时:0 ms,内存消耗:38.8 MB*/
/*            int l=nums.length;
            int sum=0;
            for (int i : nums) {
                sum+=i;
            }
            return l*(l+1)/2-sum;*/
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
