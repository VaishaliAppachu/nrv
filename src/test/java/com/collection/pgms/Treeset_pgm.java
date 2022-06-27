package com.collection.pgms;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Treeset_pgm {

	public static void main(String[] args) {
		TreeSet<Object> ts = new TreeSet<>();
		ts.add(1);
		ts.add(2);
		ts.add(3);
		ts.add(4);
		ts.add(5);
		//ts.add('A');
		Iterator<Object> ite = ts.iterator();  //instead of foreach
		while(ite.hasNext())
		{
		System.out.println(ite.next());
		//System.out.println(hs);

	}

}

}


