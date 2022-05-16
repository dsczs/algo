package com.algo.linkedlist;

import com.algo.dto.ListNode;

/**
 * 链表翻转
 */
public class LinkListReverse {

    public static void Traverse_recursive(ListNode head){
        while (head!=null){
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
        System.out.println("翻转前");
        Traverse_recursive(head);
        ListNode l = Reverse(head);
        System.out.println("翻转后");
        Traverse_recursive(l);
    }

    public static ListNode Reverse(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null){
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }
}
