/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import java.util.ArrayList;
import java.util.List;
class Solution {
    public int pairSum(ListNode head) {
         ListNode current = head;
        List<ListNode> list =  new ArrayList<>();
        while (current != null){
            list.add(current);
            current = current.next;
        }

       // System.out.println(list.size());
        int n = list.size();
        int max = 0; 
        for(int i = 0 ; i<list.size()/2; i++){
            ListNode twin1 = list.get(i);
            ListNode twin2 = list.get(n-i-1);
            int sum = twin1.val + twin2.val;
            if(sum> max)
                max  = sum;
           
        }
        return max;
    }
}
