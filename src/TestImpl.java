
public class TestImpl  {

	public Node rotateList(Node head, int n) {

		Node node = null;
		Node node2 = null;
		Node node3 = null;
		for (int count = 0; count <= n; count++) {
			if (count == 0) {
				node = head;
				head.setNext(null);

			} else {
				node2 = new Node();
				node2.setName(node.getName());
				node2.setNext(node.getNext());
				node.setNext(node);
				//node2.getNext();
			}

		}
		return node2;
	}

}

class Node {

	private String name;
	private Node next;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
