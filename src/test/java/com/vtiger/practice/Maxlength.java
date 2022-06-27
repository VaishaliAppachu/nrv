package com.vtiger.practice;

public class Maxlength {

	public static void main(String[] args) {
		String a[]= {"Varshitaaa","Roopi","Tysdet","Vaish","Roopppppppp"};
		String max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(max.length()<a[i].length())
			{
				max=a[i];
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(max.length()==a[i].length())
			{
				System.out.println(a[i]);
			}
		}
	}
	}


