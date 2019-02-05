package com.pokerbean.leetcode.listnode;

/**
 * @class: ReverseListNode.java
 * @version: 1.0
 * @author: CM
 * @e-mail: chenmao@danlu.com
 * @date: 2019/1/11 18:21
 * Created By IntelliJ  IDEA
 */
public class ReverseListNode {

    public ListNode reverseListNode(ListNode origin){
        if (origin == null || origin.next == null) {
            return origin;
        }
        ListNode nextNode = origin.next;
        origin.next = null;
        ListNode reverseListNode = reverseListNode(nextNode);
        nextNode.next = origin;
        return reverseListNode;
    }

    public ListNode reverseListNodeDie(ListNode origin){
        if (origin == null) {
            return origin;
        }
        ListNode preNode = null;
        ListNode nextNode = null;
        ListNode nowNode = origin;
        while (nowNode!=null){
            nextNode = nowNode.next;
            nowNode.next = preNode;
            preNode = nowNode;
            nowNode = nextNode;
        }
        return preNode;
    }
}
