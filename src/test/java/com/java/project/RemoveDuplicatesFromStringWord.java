package com.java.project;

import java.util.LinkedHashSet;

public class RemoveDuplicatesFromStringWord {

	public static void main(String[] args) {
		 String s="Welcome to india india vaish";
	     String[] str = s.split(" ");
	     LinkedHashSet<String> set = new LinkedHashSet<String>();
	     for(int i=0;i<str.length;i++)
	     {
	    	 set.add(str[i]);
	     }
	     for (String word : set) 
	     {
			System.out.print(word+" ");
		}
	}

}
