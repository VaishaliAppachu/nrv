package com.java.project;

public class BubblesortDescendingOrder {

	public static void main(String[] args) {
        int a[]= {19,4,28,41,23,04,86,54};
        for(int i=0;i<a.length;i++)
        {
        	for(int j=i+1;j<a.length;j++)
        	{
        		if(a[i]<a[j])
        		{
        			int temp=a[i];
        			a[i]=a[j];
        			a[j]=temp;
        		}
        	}
        	System.out.print(a[i]+" ");
        }
	}

}
