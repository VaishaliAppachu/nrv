package com.collection.pgms;

public class LinkedList {

	public static void main(String[] args) {
     java.util.LinkedList<Object> l= new java.util.LinkedList<>();
     l.add(20);
     l.add(30);
     l.add('a');
     l.add("hi");
     l.addFirst("hello");
     System.out.println(l);
     l.addLast("bye");
     System.out.println(l);
     System.out.println(l.getLast());
     System.out.println(l.getFirst());   
	}
}
