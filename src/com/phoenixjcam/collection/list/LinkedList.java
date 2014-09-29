package com.phoenixjcam.collection.list;

/**
 * 
 * 
 * @author Bart88
 *
 * @param <E>
 */
public class LinkedList<E> implements List<E>
{
	private int size;

	private Node<E> first;
	private Node<E> last;

	public LinkedList()
	{
		// TODO Auto-generated constructor stub
	}

	private static class Node<E>
	{
		E item;
		Node<E> next;
		Node<E> last;

		public Node(Node<E> prev, E element, Node<E> next)
		{
		}
	}

	public E getFirst()
	{
		return null;
	}

	public E getLast()
	{
		return null;
	}

	@Override
	public void add(E element)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void add(int index, E element)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public E get(int index)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void set(int index, E element)
	{
		// TODO Auto-generated method stub
	}

	@Override
	public void remove(int index)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isEmpty()
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size()
	{
		// TODO Auto-generated method stub
		return 0;
	}

}
