package com.java.project;

import java.util.LinkedHashSet;

public class NumberOfOccuranceOfEachChar {

	public static void main(String[] args) {
		String s="india";
		//step:1 create set of collection and all char of String

		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		//step:2 compare each char of set with all the char in string
		for (Character ch : set)
		{
			int count=0;		
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					count++;  //step:3 If its matching increment the count
				}
			}
			System.out.println(ch+"="+count);  //step:4 print both char and count
		}
	}

}
