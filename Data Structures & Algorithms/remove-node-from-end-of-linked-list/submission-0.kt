/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
              var N = 0
        var cur = head

        while (cur != null) {
            N++
            cur = cur.next
        }

        val removeIndex = N - n
        if (removeIndex == 0) {
            return head?.next
        }

        cur = head
        for (i in 0 until N - 1) {
            if (i + 1 == removeIndex) {
                cur?.next = cur?.next?.next
                break
            }
            cur = cur?.next
        }
        return head
    }
}
