package com.jay.staticexample;

public class Student {
	
	     int rollno;  
	     String name;  
	     static String college = "ITS";  
	     
	     //static method to change the value of static variable  
	     static void change(){  
	    	 college = "BBDIT";  
	     }  
	     
	     void change1(){  
	    	 college = "BBDIT";  
		  }  
	     //constructor to initialize the variable  
	     Student(int r, String n){  
	     rollno = r;  
	     name = n;  
	     college="12";
	     }  
	     //method to display values  
	     void display(){System.out.println(rollno+" "+name+" "+college);}  
	
}
