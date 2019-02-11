package com.pokerbean.leetcode.listnode;

import java.util.Stack;

/**
 * created by IntelliJ IDEA
 *
 * @author: pokerbean
 * @e-mail: brutalmraz@gmail.com
 * @time: 2019-02-05 18:17
 * @desc: PalinDrome
 */
public class PalinDrome {


    /**
     * 利用栈结构比较
     *
     * @param head
     * @return
     */
    public static boolean isPalindromeByStack(ListNode head) {

        if (head == null || head.next == null) {
            return true;
        }
        Stack<ListNode> stack = new Stack<>();
        ListNode slow = head;
        ListNode fast = head;

        stack.push(slow);
        while (fast.next != null && fast.next.next !=  null){
            slow = slow.next;
            fast = fast.next.next;
            stack.push(slow);
        }

        // 如果是偶数
        if (fast.next != null) {
            slow = slow.next;
        }
        ListNode current = slow;
        while (slow!=null && slow.next != null){
            // 当前节点和 栈顶比较
            if (current.val != stack.pop().val) {
                return  false;
            }
            current = current.next ;
        }
        return true;
    }



    /**
     * 利用解耦思想，先找出中点，再截取后半段进行链表反转，最后与原链表进行比较
     *
     * @param head
     * @return
     */
    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode origin = head;

        ListNode middle = findMiddle(head);
        middle.next = reverseListNodeDie(middle.next);

        ListNode pre = origin;
        ListNode nex = middle.next;
        while (nex != null && pre != null && nex.val == pre.val) {
            pre = pre.next;
            nex = nex.next;
        }
        return nex == null;
    }

    /**
     * 快慢指针寻找中间节点
     *
     * @param head
     * @return
     */
    public static ListNode findMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode min = head;
        ListNode max = head.next; // 这里注意要先区分开min max ，不然【1,2】这种情况会走两次while，造成中点变成2
        while (max != null && max.next != null) {
            min = min.next;
            max = max.next.next;
        }
        return min;
    }

    /**
     * 迭代反转链表
     *
     * @param origin
     * @return
     */
    public static ListNode reverseListNodeDie(ListNode origin) {
        if (origin == null) {
            return origin;
        }
        ListNode preNode = null;
        ListNode nextNode = null;
        ListNode nowNode = origin;
        while (nowNode != null) {
            nextNode = nowNode.next;
            nowNode.next = preNode;
            preNode = nowNode;
            nowNode = nextNode;
        }
        return preNode;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
//        ListNode l3 = new ListNode(1);
        l1.next = l2;
//        l2.next = l3;
        boolean palindrome = isPalindrome(l1);
        System.out.println(palindrome);
    }

}
