package application;


public class LinkedList<T extends Comparable<T>> {

	Node<T> head;

	public void insert(T data) {

		Node<T> newnode = new Node<>(data);
		Node<T> curr = head;
		Node<T> prev = null;
		if (head == null) {
			head = newnode;

		} else {
			for (; curr != null && curr.data.compareTo(data) < 0; prev = curr, curr = curr.next)
				;

			if (prev == null) {
				newnode.next = curr;
				head = newnode;

			} else if (curr == null) {

				prev.next = newnode;

			} else {
				newnode.next = curr;
				prev.next = newnode;

			}

		}

	}

	public Node delet(T data) {
		Node<T> curr = head;
		Node<T> prev = null;
		if (head == null) {
			return null;
		}
		for (; curr != null && curr.data.compareTo(data) < 0; prev = curr, curr = curr.next)
			;
		if (curr == null)
			return null;

		if (prev == null)
			head = curr.next;

		else if (curr.next == null)
			prev.next = null;

		else
			prev.next = curr.next;

		return curr;

	}

	public Node find(T data) {

		return find(data, head);

	}

	private Node find(T data, Node curr) {
		if (curr == null)
			return null;

		if (curr.data.compareTo(data) == 0)
			return curr;

		return find(data, curr.next);

	}

	//
	//
	//
	//
	// public Node find(T data) {
	//
	// Node<T> curr = head;
	//
	// if(head==null)
	// {
	// return null;
	// }
	// for(;curr != null &&curr.data.compareTo(data)!=0;curr=curr.next);
	// if(curr==null)
	// return null;
	//
	//
	//
	//
	//
	// return curr;
	//
	//
	//
	// }
	//
	public void Reverse_iterative() {
		if (head == null || head.next == null)
			return;

		Node curr = head;
		
	Node prev=null;
	Node next=null;
	
	while (curr !=null) {
		
		
		
		
		next=curr.next;
		curr.next=prev;
		prev=curr;
		curr= next;
		
		
		
	}	
		head=prev;
		
		
		
		
		
		

	}

	public void reverse_Recursive() {
		if (head == null || head.next == null)
			return;

		Node curr = head;
		reverse(head, head.next);
		curr.next = null;

	}

	private void reverse(Node data, Node curr) {
		if (curr.next == null) {
			curr.next = data;
			head = curr;
			return;
		}

		reverse(data.next, curr.next);
		curr.next = data;

	}

	public Node max() {
		if (head == null)
			return null;
		return max(head, head);

	}

	private Node max(Node n, Node maxim) {
		if (n == null)
			return maxim;

		if (n.data.compareTo(maxim.data) > 0)
			maxim = n;

		return max(n.next, maxim);

	}

	public Node min() {
		if (head == null)
			return null;
		return min(head, head);

	}

	private Node min(Node n, Node min) {
		if (n == null)
			return min;

		if (n.data.compareTo(min.data) < 0)
			min = n;

		return min(n.next, min);

	}

	public void travrce() {
		Node<T> curr = head;

		while (curr != null) {
			System.out.print(curr + "-->");
			curr = curr.next;

		}
		System.out.print("null");

		System.out.println();
	}

}