package com.pokerbean.leetcode.listnode;

/**
 * @class: MergeTwoList.java
 * @version: 1.0
 * @author: CM
 * @e-mail: chenmao@danlu.com
 * @date: 2019/1/30 17:00
 * Created By IntelliJ  IDEA
 */
public class MergeTwoList {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = null;
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val <= l2.val) {
            head = l1;
            l1 = l1.next;
        } else {
            head = l2;
            l2 = l2.next;
        }

        ListNode tmp = head;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                tmp.next = l1;
                l1 = l1.next;
            } else {
                tmp.next = l2;
                l2 = l2.next;
            }
            tmp = tmp.next;
        }

        if (l1 == null) {
            tmp.next = l2;
        }
        if (l2 == null) {
            tmp.next = l1;
        }

        return head;
    }
}
