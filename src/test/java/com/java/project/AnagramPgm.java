package com.java.project;

import java.util.Arrays;

public class AnagramPgm {

	public static void main(String[] args) {
     String s1="Faer";
     String s2="fare";
   char[] a1 = s1.toLowerCase().toCharArray();
   char[] a2 =s2.toLowerCase().toCharArray();
   Arrays.sort(a1);
   Arrays.sort(a2);
   boolean result = Arrays.equals(a1, a2);
   if(result==true)
    {
    	System.out.println("Its an anagram");
    }else {
    	System.out.println("Its not an anagram");
    }
	}

}
