package com.rjasw.project.leetcode;

import java.util.LinkedList;
import java.util.Queue;

//
//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
//
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//
// 
//
//Example 1:
//
//Input: l1 = [2,4,3], l2 = [5,6,4]
//Output: [7,0,8]
//Explanation: 342 + 465 = 807.
/*
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class ListNode {
	int val;
	ListNode next;
	
	ListNode() {
		this(0);
	}
	
	ListNode(int val) { 
		this.val = val; 
		this.next = null;
	}
	
	ListNode(int val, ListNode next) { 
		this.val = val; 
		this.next = next; 
	}
}

class Stack {
	
	ListNode top;
	
	public Stack() {
		// TODO Auto-generated constructor stub
		this.top = null;
	}
	
	void push(int data) {
		if(this.top == null) {
			this.top = new ListNode(data);
		} else {
			ListNode newnode = new ListNode(data);
			newnode.next = this.top;
			this.top = newnode;
		}
	}
	
	int pop() {
		ListNode tmp = this.top;
		this.top = this.top.next;
		return tmp.val;
	}
	
	boolean isEmpty() {
		return (this.top == null);
	}
}

public class AddTwoNumbers_solution {
    
	public void display(ListNode head) {
	    if (head == null) {
	    	System.out.println("head is null");
	        return;
	    }
	    ListNode current = head;
	    while (current != null) {
	        System.out.print(current.val + " -> ");
	        current = current.next;
	    }
	    System.out.println("null");
	}	

	public void add(ListNode head, int data) {
		System.out.println("data - "+ data);
		if(head == null) {
			head = new ListNode(data);
		} else {
			ListNode current = head;
			while(current.next != null) {
				current = current.next;
			} //go till end
			
			current.next = new ListNode(data);
		}	
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
		Queue<Integer> q1 = new LinkedList<>();
		Queue<Integer> q2 = new LinkedList<>();
		
		while(l1!= null) {
			q1.offer(l1.val);
			l1 = l1.next;
		}
		
		while(l2!= null) {
			q2.offer(l2.val);
			l2 = l2.next;
		}
		
		ListNode newNode = new ListNode(0);
		ListNode curr = newNode;
		int sum = 0;		
		while( !q1.isEmpty() || !q2.isEmpty() || sum!=0) {
			
			if(!q1.isEmpty()) {
				sum += q1.poll();
			}
			
			if(!q2.isEmpty()) {
				sum += q2.poll();
			}
			
			curr.next = new ListNode(sum%10);
			curr = curr.next;
			
			sum /= 10;
		}
		
		return newNode.next;
    }
}
