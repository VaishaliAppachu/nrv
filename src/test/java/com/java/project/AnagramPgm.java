package com.java.project;

public class AnagramPgm {

	public static void main(String[] args) {
     String s1="fear";
     String s2="fare";
   char[] a1 = s1.toCharArray();
   char[] a2 =s2.toCharArray();
   String s3=new String(a1);
   String s4=new String(a2);
    if(s3.equals(s4))
    {
    	System.out.println("Its an anagram");
    }else {
    	System.out.println("Its not an anagram");
    }
	}

}
