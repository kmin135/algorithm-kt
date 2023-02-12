package leetcode.array.easy

// https://leetcode.com/problems/running-sum-of-1d-array
class Solution {
    fun runningSum(nums: IntArray): IntArray {
        for(i: Int in 1 until nums.size) {
            nums[i] += nums[i-1]
        }

        return nums
    }
}

fun main() {

    Solution().runningSum(intArrayOf(1,2,3,4)).forEach(::println)
}