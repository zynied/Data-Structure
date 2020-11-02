package com.nzy.leetcode.array;

import java.util.HashMap;

public class TwoSum{
    public static void main(String[] args) {
        Solution solution = new TwoSum().new Solution();
        int nums[]=new int[]{1,-2,3,5};
        int[] indexs = solution.twoSum(nums, 6);
        for (int index : indexs) {
            System.out.println(index);
        }

    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            //1.暴力破解法(劣)
            /*时间复杂度:O(n²),空间复杂度:O(1)*/
            /*执行耗时:66 ms,内存消耗:38.7 MB*/
            /*for (int i=0;i<nums.length;i++){
                for (int j=i+1;j<nums.length;j++){
                    if (nums[i]+nums[j]==target){
                        return new int[]{i,j};
                    }
                }
            }
            return new int[]{-1,-1};*/
            //2.哈希表法(优)
            /*时间复杂度:O(n),空间复杂度:O(1)*/
            /*执行耗时:2 ms,内存消耗:38.6 MB*/
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i=0;i<nums.length;i++){
                int diff=target-nums[i];
                if (map.containsKey(diff)) return new int[]{map.get(diff),i};
                map.put(nums[i],i);
            }
            return new int[]{-1,-1};
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
