package dailyPracticeCode.March.day4;

public class LinkedList_AddFirst {
	Node head;
	private int size;

	class Node {
		String data;
		Node next;

		Node(String data) {
			this.data = data;
			this.next = null;
		}
	}

	public void addFirst(String data) {

		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;

	}

	public void printList() {
		Node currNode = head;

		while (currNode != null) {
			System.out.print(currNode.data + " -> ");
			currNode = currNode.next;
		}

		System.out.println("null");
	}

	public static void main(String[] args) {

		LinkedList_AddFirst list = new LinkedList_AddFirst();
		list.addFirst("aa");
		list.addFirst("bb");
		list.addFirst("cc");
		list.addFirst("DD");
		list.addFirst("ff");
		list.printList();
	}

}
