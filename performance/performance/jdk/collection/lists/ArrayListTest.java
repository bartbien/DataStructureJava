package performance.jdk.collection.lists;

import org.junit.Test;

import performance.jdk.collection.runner.SizeUtils;


public class ArrayListTest
{

	@Test
	public void addArrayList()
	{
		java.util.ArrayList<String> arrayList = new java.util.ArrayList<String>();
		for (int i = 0; i < SizeUtils.size; i++)
		{
			arrayList.add("test" + i);
		}
	}
}
