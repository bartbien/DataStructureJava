package performance.jdk.lists;

import java.util.Vector;

import org.junit.Test;

import utils.CommonUtils;

public class TestVector
{

	@Test
	public void addVector()
	{
		Vector<String> vector = new Vector<String>();
		for (int i = 0; i < CommonUtils.million; i++)
		{
			vector.add("test" + i);
		}
	}

}
