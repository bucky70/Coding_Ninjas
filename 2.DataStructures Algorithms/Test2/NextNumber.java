/* 
Given a large number represented in the form of a linked list. Write code to increment the number by 1 in-place(i.e. without using extra space).
Note: You don't need to print the elements, just update the elements and return the head of updated LL.
Input Constraints:
1 <= Length of Linked List <=10^6.
Input format :
Line 1 : Linked list elements (separated by space and terminated by -1)
Output Format :
Line 1: Updated linked list elements 
Sample Input 1 :
3 9 2 5 -1
Sample Output 1 :
3 9 2 6
Sample Input 2 :
9 9 9 -1
Sample Output 1 :
1 0 0 0 
*/
/*************** 
 * Following is the Node class already written 
class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.data = data;
	}
}
 ***************/

public class Solution {


	public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head) {
       head = reverseLLI(head);
       head=addOneToLL(head);
        return reverseLLI(head);
    }
  
    public static LinkedListNode<Integer> addOneToLL(LinkedListNode<Integer> head){
        int carry=1,sum=0;
        LinkedListNode<Integer> temp=null,result=head;
        while(head!=null){
            sum=head.data+carry;
            carry=(sum>=10)?1:0;
            head.data=sum%10;
            temp=head;
            head=head.next;
        }
        if(carry>0){
            LinkedListNode<Integer> newNode=new LinkedListNode<Integer>(carry);
            temp.next=newNode;
            temp.next.next=null;
        }
        return result;
    }
    
    public static LinkedListNode<Integer> reverseLL(LinkedListNode<Integer> head){
        if(head==null||head.next==null){
            return head;
        }
        else{
            LinkedListNode<Integer> temp=reverseLL(head.next);
            head.next.next=head;
            head.next=null;
            return temp;
        }
    }
    public static LinkedListNode<Integer> reverseLLI(LinkedListNode<Integer> head){
           LinkedListNode prev = null;
        LinkedListNode current = head;
        LinkedListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }
}


