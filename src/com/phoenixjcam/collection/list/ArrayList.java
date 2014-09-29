package com.phoenixjcam.collection.list;


/**
 * 
 * @author Bart88
 *
 * @param <E>
 */
public class ArrayList<E> implements List<E>
{
	private Object[] arrayElements;

	private static final int MINIUMUM_CAPACITY = 10;

	private int size;

	public ArrayList()
	{
		arrayElements = new Object[MINIUMUM_CAPACITY];
		size = 0;
	}

	public ArrayList(int initCapacity)
	{
		if (initCapacity < 0)
			throw new IllegalArgumentException("Illegal capacity " + initCapacity);

		arrayElements = new Object[initCapacity];
		size = 0;
	}

	/**
	 * Max int size is 2147483647 = 2<sup>31</sup>-1.
	 */
	public void grow()
	{
		Object[] tmpArrayElements = arrayElements;

		int oldCapacity = arrayElements.length;
		int newCapacity = oldCapacity + (oldCapacity / 2);

		arrayElements = new Object[newCapacity];
		
		for (int i = 0; i < tmpArrayElements.length; i++)
		{
			arrayElements[i] = tmpArrayElements[i];
		}
	}

	public void ensureCapacity()
	{
		if (size >= arrayElements.length)
			grow();
	}

	@Override
	public void add(E element)
	{
		ensureCapacity();

		arrayElements[size] = element;
		size++;
	}

	@Override
	public void add(int index, E element)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void get(int index)
	{
		// TODO Auto-generated method stub

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

	public static void main(String[] args)
	{
		// ArrayList<String> arrayList = new ArrayList<String>(-20);
		ArrayList<String> arrayList = new ArrayList<String>();

		for (int i = 0; i < 20; i++)
		{
			arrayList.add("test" + i);
		}

		arrayList.add("test1");
		arrayList.add("test2");
	}
}
