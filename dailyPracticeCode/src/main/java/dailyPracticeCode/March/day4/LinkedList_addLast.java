package dailyPracticeCode.March.day4;

public class LinkedList_addLast {

	public static void main(String[] args) {
		LinkedList_addLast list = new LinkedList_addLast();
	       list.addLast("is");
	       list.addLast("a");
	       list.addLast("list");
	       list.printList();
	  
	       list.addFirst("this");
	       list.printList();

	}
	
	 	Node head;
	   private int size;
	 
	   LinkedList_addLast () {
	       size = 0;
	   }
	 
	   public class Node {
	       String data;
	       Node next;
	 
	       Node(String data) {
	           this.data = data;
	           this.next = null;
	           size++;
	       }
	   }
	 
	   public void addFirst(String data) {
	       Node newNode = new Node(data);
	       newNode.next = head;
	       head = newNode;
	   }
	 
	   public void addLast(String data) {
	       Node newNode = new Node(data);
	 
	       if(head == null) {
	           head = newNode;
	           return;
	       }
	 
	       Node lastNode = head;
	       while(lastNode.next != null) {
	           lastNode = lastNode.next;
	       }
	 
	       lastNode.next = newNode;
	   }
	 
	   public void printList() {
	       Node currNode = head;
	 
	       while(currNode != null) {
	           System.out.print(currNode.data+" -> ");
	           currNode = currNode.next;
	       }
	 
	       System.out.println("null");
	   }


}
