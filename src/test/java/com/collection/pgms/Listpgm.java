package com.collection.pgms;

import java.util.ArrayList;

public class Listpgm {

	public static void main(String[] args) {
		  ArrayList<Object> list=new ArrayList<>();
		   list.add(20);
		   list.add("b");
		   list.add("hey");
		   list.add("hmm");
		   list.add('v');
		   //list.remove(1);
		   ArrayList<Object> list1=new ArrayList<>();
		   list.add(201);
		   list.add("bc");
		   list.add("hey u");
		   list.add("hmm ok");
		   list1.add('v');	   
		   list.retainAll(list1);
		   System.out.println(list);
		}
	
	   
		   /*if(list.contains('a'))
		   {
			   System.out.println("present");
		   }			   
		   else {
			   System.out.println("not present");		   
		   }
		   }

		}
		
	*/
	}


