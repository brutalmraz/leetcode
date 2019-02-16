package com.pokerbean.leetcode.listnode;

/**
 * created by IntelliJ IDEA
 *
 * @author: pokerbean
 * @e-mail: brutalmraz@gmail.com
 * @time: 2019-02-16 20:27
 * @desc: CycleListNode
 */
public class CycleListNode {

    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null &&fast.next!=null ){
            if (fast == slow) {
                return true;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        l1.next =l2;
        l2.next =l1;
//        l3.next =l2;
        boolean hasCycle = hasCycle(l1);
        System.out.println(hasCycle);
    }
}
