package com.algo.linkedlist;

import com.algo.dto.ListNode;

/**
 * 链表的遍历
 */
public class Traverse {

    public static void main(String[] args) {
        ListNode head = new ListNode(1,new ListNode(2,new ListNode(3)));
        System.out.println("递归方式遍历");
        Traverse_recursive(head);

        System.out.println("迭代方式遍历");
        Traverse_iterate(head);
    }

    public static void Traverse_recursive(ListNode head){
        while (head!=null){
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static void Traverse_iterate(ListNode head){
        for (ListNode i = head; i != null ; i = i.next) {
            System.out.println(i.val);
        }
    }
}
