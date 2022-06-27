package com.java.project;

public class RevStringWithoutMethodsnVariable {

	public static void main(String[] args) {
      String s="Hello";
      char[] ch = s.toCharArray();
      String rev="";
      for (char c : ch)
      {
		rev=c+rev;
	}
      System.out.println(rev);
	}

}
