package performance.jdk.collection.lists;

import java.util.LinkedList;

import org.junit.Test;

import performance.jdk.collection.runner.SizeUtils;

public class LinkedListTest
{

	@Test
	public void addLinkedList()
	{
		LinkedList<String> linkedList = new LinkedList<String>();
		for (int i = 0; i < SizeUtils.size; i++)
		{
			linkedList.add("test" + i);
		}
	}
}
