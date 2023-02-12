package leetcode.array.easy

// https://leetcode.com/problems/richest-customer-wealth
class RichestCustomerWealth {
    fun maximumWealth(accounts: Array<IntArray>): Int {
        return accounts.map { it.sum() }.max()
    }
}

fun main() {
    RichestCustomerWealth().maximumWealth(arrayOf(intArrayOf(1,2,3), intArrayOf(3,2,1))).run { println(this) }
    RichestCustomerWealth().maximumWealth(arrayOf(intArrayOf(2,8,7), intArrayOf(7,1,3), intArrayOf(1,9,5))).run { println(this) }
}