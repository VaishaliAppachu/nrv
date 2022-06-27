package com.java.project;

public class FirstMinAndSecondMinNumber {

	public static void main(String[] args) {
       int a[]= {19,2,8,9,41,56};
       int Fmin=a[0];
       int Smin=a[0];
       for(int i=1;i<a.length;i++)
       {
    	   if(Fmin>a[i])
    	   {
    		   Smin=Fmin;
    		   Fmin=a[i];
    	   }
    	   else if(Smin>a[i])
    	   {
    		   Smin=a[i];
    	   }
       }
       System.out.println("First min number----->"+Fmin);
       System.out.println("Second min number----->"+Smin);
	}

}
