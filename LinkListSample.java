class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class LinkListSample {

	Node head;
	void add(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			while (temp.next != null){
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("null");
		System.out.println();
	}

	public static void main(String[] args) {
		LinkListSample list = new LinkListSample();
		list.add(10);
		list.add(20);
		list.add(30);
		list.printList();
	}
}
