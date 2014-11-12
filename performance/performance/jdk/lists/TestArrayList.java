package performance.jdk.lists;

import org.junit.Test;

import utils.CommonUtils;

public class TestArrayList
{
	@Test
	public void addArrayList()
	{
		java.util.ArrayList<String> arrayList = new java.util.ArrayList<String>();
		for (int i = 0; i < CommonUtils.million; i++)
		{
			arrayList.add("test" + i);
		}
	}
}
