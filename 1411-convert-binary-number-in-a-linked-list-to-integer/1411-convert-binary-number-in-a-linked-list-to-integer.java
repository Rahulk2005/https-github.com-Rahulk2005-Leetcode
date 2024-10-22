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
class Solution {
    public int getDecimalValue(ListNode head) {
        // String s="";
        // ListNode temp = head;
        // while(temp!=null)
        // {
        //     s+= temp.val;
        //     temp = temp.next;
        // }
        // int decimal = Integer.parseInt(s, 2);

        // return decimal;

        int size  = 0;
        ListNode temp = head;

        while(temp!=null)
        {
            temp = temp.next;
            size++;
        }
        temp = head;
        int res = 0;
        for(int i=0;i<size;i++)
        {
            res=res+temp.val * (int)Math.pow(2,size-i-1);
            temp = temp.next;
        }
        return res;
    }
}