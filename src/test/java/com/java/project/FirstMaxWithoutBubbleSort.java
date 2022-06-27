package com.java.project;

public class FirstMaxWithoutBubbleSort {

	public static void main(String[] args) {
    int a[]= {10,13,54,41,61};
    int max=a[0];
    for(int i=0;i<a.length;i++)
    {
    	if(max<a[i])
    	{
    		max=a[i];
    	}
    }
    System.out.println(max);
	}

}
