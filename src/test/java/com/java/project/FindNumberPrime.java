package com.java.project;

public class FindNumberPrime
{

	public static void main(String[] args) 
	{
		int num=2;
		int j=2;
		while(num>=j)
		{
			if(num%j==0)
			{
				break;
			}
			{
				j++;
			}
			if(num==j)
			{
				System.out.println("Prime number is"+num);
			}
		}

	}

}
