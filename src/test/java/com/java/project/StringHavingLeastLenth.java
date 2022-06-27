package com.java.project;

public class StringHavingLeastLenth {

	public static void main(String[] args) {
      String a[]= {"Vai", "Roopa" ,"Varshita","Tysdet"};
      String min=a[0];
      for(int i=1;i<a.length;i++)
      {
    	  if(min.length()>a[i].length())
    	  {
    		  min=a[i];
    	  }
      }
	  System.out.println(min);
	}
}
