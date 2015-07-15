import java.util.*;

public class MyQueue {
	private List<Node> queue;

	MyQueue()
	{
		queue = new LinkedList<Node>();
	}

	public void add(Node n)
	{
		queue.add(n);
	}

	public void addString(String s)
	{
		Node n = new Node(s);
		add(n);
	}

	public Node remove()
	{
		Node n = queue.get(0);
		queue.remove(0);
		return n;
	}

	/**
	 * Inner class representing queue node.
	 *
	 * It really should be static, but it's not static 
	 * to show how crazy is syntax - see main()
	 */
	public class Node {
		private String string;
		
		Node(String s)
		{
			string = s;
		}

		String value()
		{
			return string;
		}
	}

	public class QueueIterator {
		private MyQueue q;
		public QueueIterator()
		{
			// Save reference of the outer class 
			// this iterator belongs to
			q = MyQueue.this;			
		}

		public Node next()
		{
			return q.remove();
		}
	}

	public static void main (String [] args)
	{
		MyQueue q = new MyQueue();

		/*
		 * XXX:
		 * Using q.new is necessary because main is static function.
		 * Compare it with q.addString. addString is not static so we 
		 * can just use new without specifying context for it.
		 */
		q.add(q.new Node("1"));
		q.addString("2");

		System.out.println(q.remove().value());
		q.add(q.new Node("3"));
		q.add(q.new Node("4"));
		q.add(q.new Node("5"));

		QueueIterator iter = q.new QueueIterator();
		System.out.println(iter.next().value());
		System.out.println(iter.next().value());
		System.out.println(iter.next().value());
	}
}
