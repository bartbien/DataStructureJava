package performance.jdk.lists;

import java.util.LinkedList;

import org.junit.Test;

import utils.CommonUtils;

public class TestLinkedList
{
	@Test
	public void addLinkedList()
	{
		LinkedList<String> linkedList = new LinkedList<String>();
		for (int i = 0; i < CommonUtils.million; i++)
		{
			linkedList.add("test" + i);
		}
	}
}
