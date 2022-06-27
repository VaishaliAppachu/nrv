package com.java.project;

public class PrimeNumber {

	public static void main(String[] args) {
		int a[]= {2,5,10,14,49,7,3};
		for(int i=0;i<a.length;i++)
		{
			int n=a[i];
			int j=2;
			while(n>=j)
			{
				if(n%j==0)
				{
					break;
				}
				{
					j++;
				}
			}
			if(n==j)
			{
				System.out.println(a[i]);
			}
		}
	}

}
