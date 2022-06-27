package com.java.project;

public class FirstMinWithoutBubbleSort {

	public static void main(String[] args) {
      int a[]= {13,35,41,19,84};
      int min=a[0];
      for(int i=0;i<a.length;i++)
      {
    	  if(min>a[i])
    	  {
    		  min=a[i];
    	  }
      }
      System.out.println(min);
	}

}
