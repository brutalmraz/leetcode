package com.pokerbean.leetcode;

import com.pokerbean.leetcode.listnode.ListNode;
import com.pokerbean.leetcode.listnode.ReverseListNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LeetcodeApplicationTests {



    @Test
    public void contextLoads() {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        listNode1.next =listNode2;
        listNode2.next =listNode3;
        listNode3.next =listNode4;
        ReverseListNode service = new ReverseListNode();
//        ListNode reverseListNode = service.reverseListNode(listNode1);
        ListNode reverseListNode2 = service.reverseListNodeDie(listNode1);

//        System.out.println(reverseListNode);
        System.out.println(reverseListNode2);
    }

}
