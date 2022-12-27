package com.jiehu.code.dp.bag.bagall;

/**
 * 518. 零钱兑换 II
 * https://leetcode.cn/problems/coin-change-ii/
 * 给你一个整数数组 coins 表示不同面额的硬币，另给一个整数 amount 表示总金额。
 * 请你计算并返回可以凑成总金额的硬币组合数。如果任何硬币组合都无法凑出总金额，返回 0 。
 * 假设每一种面额的硬币有无限个。
 * 题目数据保证结果符合 32 位带符号整数。
 * 示例 1：
 * 输入：amount = 5, coins = [1, 2, 5]
 * 输出：4
 * 解释：有四种方式可以凑成总金额：
 * 5=5
 * 5=2+2+1
 * 5=2+1+1+1
 * 5=1+1+1+1+1
 * 示例 2：
 * 输入：amount = 3, coins = [2]
 * 输出：0
 * 解释：只用面额 2 的硬币不能凑成总金额 3 。
 * 示例 3：
 * 输入：amount = 10, coins = [10]
 * 输出：1
 * 提示：
 * 1 <= coins.length <= 300
 * 1 <= coins[i] <= 5000
 * coins 中的所有值 互不相同
 * 0 <= amount <= 5000
 */
public class CoinChange {
    public int change(int amount, int[] coins) {
        /**
         * 1. 定义dp[j], 含义： 容量钱数为j时的个数
         */
        int[] dp = new int[amount + 1];

        /**
         * 2. 递推公式：
         * //在01公式中就说过，求装满背包的几种方法
         *  dp[j] += dp[j-coins[i]]
         *
         *  3. 初始化dp数组，dp[0]为1
         *
         * 3. 遍历顺序：
         *     先物品后背包： 组合 （不关心顺序）
         *     先背包后物品： 排列（顺序不同，子集不同）
         *  因为本题中，求的时组合数，选择的硬币顺序不同时，硬币种类和个数相同就认为时一种
         */
        dp[0] = 1;

        for (int i = 0; i < coins.length; i++) {//物品
            for (int j = coins[i]; j <= amount; j++) {//背包
                dp[j] += dp[j - coins[i]];
            }
        }

        return dp[amount];
    }
}
