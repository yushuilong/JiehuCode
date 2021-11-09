package com.jiehu.code.SlidingWindow;

/**
 * 1151 最少交换次数来组合所有的 1
 * 给出一个二进制数组data，你需要通过交换位置，将数组中任何位置上的1组合到一起，并返回所有可能中所需最少的交换次数。
 * <p>
 * 示例 1：
 * 输入：[1,0,1,0,1]
 * 输出：1
 * 解释：
 * 有三种可能的方法可以把所有的 1 组合在一起：
 * [1,1,1,0,0]，交换 1 次；
 * [0,1,1,1,0]，交换 2 次；
 * [0,0,1,1,1]，交换 1 次。
 * 所以最少的交换次数为 1。
 * <p>
 * 示例 2：
 * 输入：[0,0,0,1,0]
 * 输出：0
 * 解释：
 * 由于数组中只有一个 1，所以不需要交换。
 * <p>
 * 示例 3：
 * 输入：[1,0,1,0,1,0,0,1,1,0,1]
 * 输出：3
 * 解释：
 * 交换 3 次，一种可行的只用 3 次交换的解决方案是 [0,0,0,0,0,1,1,1,1,1,1]。
 */
public class MinSwaps {
    /**
     * 解题思路：
     * 1。 使用滑动窗口的方式，每次滑动的窗口数为1的个数
     * 2。需要计算出数组中有多少个1；
     * 3。滑动窗口中共有多少个0，就是需要交互几次的最小次数
     */
    public int minSwaps(int[] data) {
        int min = Integer.MAX_VALUE;
        //1。 计算1的个数
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            //和就是1的格式
            count += data[i];
        }

        //记录0的个数，因为0的个数就是交换次数
        int zero = 0;
        int left = 0; //左指针
        for (int i = 0; i < data.length; i++) {
            if (data[i] == 0) {
                zero++;
            }
            //第一个判断：小于count的长度，不做计算
            //第二个判断：当前的窗口长度必须为count
            if (i >= count - 1 && i - left + 1 == count) {
                min = Math.min(zero, min);
                if (data[left] == 0) {
                    zero--;
                }
                left++;
            }
        }

        return min;
    }
}
