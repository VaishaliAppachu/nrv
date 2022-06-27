package com.collection.pgms;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashsetPgm {

	public static void main(String[] args) {
		HashSet<Object> hs = new HashSet<>();
		hs.add('a');
		hs.add("hi");
		hs.add(10);
		hs.add(null);
		hs.add(10);
		System.out.println(hs);

	}
}