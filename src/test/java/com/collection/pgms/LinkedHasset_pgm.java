package com.collection.pgms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHasset_pgm {

	public static void main(String[] args) {
		LinkedHashSet<Object> hs = new LinkedHashSet<>();
		hs.add('a');
		hs.add("hi");
		hs.add(10);
		hs.add(null);
		hs.add(10);
		hs.add(10);
		hs.add(null);
		Iterator<Object> ite = hs.iterator();  //instead of foreach
		while(ite.hasNext())
		{
		System.out.println(ite.next());
		//System.out.println(hs);

	}

}
}