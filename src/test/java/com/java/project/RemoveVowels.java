package com.java.project;

public class RemoveVowels {

	public static void main(String[] args) {
			String s="vaishali";
			for (int i = 0; i < s.length(); i++)
			{
				char ch = s.charAt(i);
				if(!(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'))
				{
					System.out.println(ch);
				}
			}
		}
	
	}


