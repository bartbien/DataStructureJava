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
		// interfaces java.util
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
}
