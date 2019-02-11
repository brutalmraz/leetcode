package com.pokerbean.leetcode.listnode;

/**
 * created by IntelliJ IDEA
 *
 * @author: pokerbean
 * @e-mail: brutalmraz@gmail.com
 * @time: 2019-02-05 18:17
 * @desc: PalinDrome
 */
public class PalinDrome {
    public boolean isPalindrome(ListNode listNode){
        if (listNode == null) {
            return false;
        }
        if (listNode.next == null){
            return true;
        }
        int len = 1;
        ListNode nowNode =listNode;
        while (nowNode.next!=null){
            nowNode = nowNode.next;
            len += 1;
        }


        return false;
    }

}
