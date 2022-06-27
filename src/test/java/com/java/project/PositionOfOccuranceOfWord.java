package com.java.project;

import java.util.LinkedHashSet;

public class PositionOfOccuranceOfWord {

	public static void main(String[] args) {
		String s="Welcome to india india hi";
		String[] str = s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(int i=0;i<str.length;i++)
		{
			set.add(str[i]);
		}
		for (String word : set) 
		{
			for (int i = 0; i < str.length; i++)
			{
				if(word.equals(str[i]))
				{
					System.out.println(" "+word+" "+(i+1));
				}

			}

		}
	}
}