package com.phoenixjcam.collection.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import com.phoenixjcam.collection.stack.Stack;

public class JavaCollectionExample
{
	public JavaCollectionExample()
	{

	}

	private void CollectionExamples()
	{ // interfaces java.util
		java.util.List<String> list;

		// classes java.util - not synchronized
		java.util.ArrayList<String> arrayList;
		java.util.LinkedList<String> linkedList;

		// old collection classes - synchronized
		java.util.Vector<String> vector;
		java.util.Stack<String> stack;

		// AWT collection - a little different VECTOR :) - List in awt based on Vector
		java.awt.List listAWT;

		java.util.Map<Integer, String> map;

		Character cha;
		Integer in;
		Double db;
	}

	public static void main(String[] args)
	{
		
		
		// ArrayList<String> arrTest = new ArrayList<String>(20);
		
		ArrayList<String> arrTest = new ArrayList<String>();
		
		for (int i = 0; i < 15; i++)
		{
			arrTest.add("test" + i);
		}
		
		arrTest.add("test16");
		arrTest.add("test17");
		arrTest.add("test18");
		
		arrTest.remove(1);
		
		arrTest.add("test4");
	}
}
