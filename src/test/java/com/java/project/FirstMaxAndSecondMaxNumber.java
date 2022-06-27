package com.java.project;

public class FirstMaxAndSecondMaxNumber {

	public static void main(String[] args) {
      int a[]= {20,13,45,16,78};
      int Fmax=a[0];
      int Smax=a[0];
      for(int i=1;i<a.length;i++)
      {
    	  if(Fmax<a[i])
    	  {
    		  Smax=Fmax;
    		  Fmax=a[i];
    	  }
    	  else if(Smax<a[i])
         {
        		  Smax=a[i];
    	  }
      }
	  System.out.println("First max number----->"+Fmax);
	  System.out.println("Second max number----->"+Smax);
	}
}
