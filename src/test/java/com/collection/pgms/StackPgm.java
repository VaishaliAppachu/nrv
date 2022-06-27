package com.collection.pgms;

import java.util.Stack;

public class StackPgm {

	public static void main(String[] args) {
     Stack<Object> s=new Stack<>();
     s.push(10);
     s.push(20);
     s.push('h');
     System.out.println(s.pop());
     System.out.println(s.pop());
     System.out.println(s.pop());
	}
}
