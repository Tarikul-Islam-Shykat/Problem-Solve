/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun pairSum(head: ListNode?): Int {
        val list = mutableListOf<ListNode>()
    var current = head
    while (current != null) {
        list.add(current)
        current = current.next
    }
 val n = list.size
    var max = 0
for (i in 0 until n / 2) {
        val twin1 = list[i]
        val twin2 = list[n - i - 1]
        val sum = twin1.`val` + twin2.`val`
        if (sum > max) {
            max = sum
        }
    } 
    return max
    }
}
