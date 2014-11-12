package performance.jdk.collection.lists;

import java.util.Vector;

import org.junit.Test;

import performance.jdk.collection.runner.SizeUtils;
import utils.CommonUtils;

public class VectorTest
{

	@Test
	public void addVector()
	{
		Vector<String> vector = new Vector<String>();
		for (int i = 0; i < SizeUtils.size; i++)
		{
			vector.add("test" + i);
		}
	}

}
