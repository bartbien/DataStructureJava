package com.phoenixjcam.collection.stack;

/**
 * LIFO stack
 * 
 * @author Bart88
 *
 * @param <E>
 *            the type of elements in this stack
 */
public class Stack<E>
{
	/**
	 * Stack size.
	 */
	private int size;

	/**
	 * Top of stack.
	 */
	private Node<E> first;

	public Stack()
	{
		this.size = 0;
		this.first = null;
	}

	/**
	 * @param <E>
	 *            the type of elements in this node
	 */
	private static class Node<E>
	{
		private E item;
		private Node<E> next;

		public Node()
		{

		}
	}

	/**
	 * 
	 * @param item
	 *            to be pushed onto this stack
	 */
	public void push(E item)
	{
		Node<E> oldfirst = first;
		first = new Node<E>();
		first.item = item;
		first.next = oldfirst;
		size++;
	}

	/**
	 * Simply test of stack method.
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		Stack<String> s = new Stack<String>();

		s.push("test1");
		s.push("test2");
		s.push("test3");
		s.push("test4");

	}
}
