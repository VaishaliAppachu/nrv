package com.java.project;

public class StringHavingMaxLength {

	public static void main(String[] args) {
		String a[]= {"Vaish", "Roopa" ,"Varshita","Tysdet"};
	      String max=a[0];
	      for(int i=1;i<a.length;i++)
	      {
	    	  if(max.length()<a[i].length())
	    	  {
	    		  max=a[i];
	    	  }
	      }
		  System.out.println(max);
		}
	
	}


