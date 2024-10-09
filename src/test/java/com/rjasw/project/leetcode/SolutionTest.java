package com.rjasw.project.leetcode;

import static org.junit.jupiter.api.Assertions.assertTrue;
import com.rjasw.project.leetcode.AddTwoNumbers_solution;

import org.junit.jupiter.api.Test;

public class SolutionTest {
	
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
		ListNode newnode = new ListNode(data);
		if(head == null) {
			head = newnode;
		} else {
			ListNode current = head;
			while(current.next != null) {
				current = current.next;
			} //go till end
			
			current.next = newnode;
		}	
	}


    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
    
    @Test
    public void TestStack() {
    	
    	Stack  st = new Stack();
    	st.push(1);
    	st.push(3);
    	
    	assert(3 == st.pop());
    }
    
    @Test
    public void TestCase1() {
    	AddTwoNumbers_solution obj = new AddTwoNumbers_solution();

    	ListNode list1 = new ListNode(2);
    	obj.add(list1,4);
    	obj.add(list1,3);
    	
    	display(list1);
    	ListNode list2 = new ListNode(5);
    	obj.add(list2,6);
    	obj.add(list2,4);
    	
    	ListNode res = obj.addTwoNumbers(list1, list2);
    	display(res);
    	
    }
    
    @Test
    public void LongestSubstringNoRepeatTest() {
    	
    	assert(5 == LongestSubstringNoRepeat.lengthOfLongestSubstring("abcabde"));
    	assert(1 == LongestSubstringNoRepeat.lengthOfLongestSubstring("bbbbb"));
    	assert(3 == LongestSubstringNoRepeat.lengthOfLongestSubstring("acbcddf"));
    	
    }
    
    @Test
    public void DivideTwoInts_BitManipulationTest() {
    	
    	assert( 21 == DivideTwoInts_BitManipulation.divide(65, 3));
    	assert( -3 == DivideTwoInts_BitManipulation.divide(-10, 3));

    }

}


