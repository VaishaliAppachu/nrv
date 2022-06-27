package com.java.project;

public class ReverseAWordsInaString {

	public static void main(String[] args) {
		 String s="Welcome to banglore";
	     String[] str = s.split(" ");	
	     for (int i = str.length-1; i >=0; i--)
	     {
	    	 System.out.print(str[i]+" ");
		}
	}

}
