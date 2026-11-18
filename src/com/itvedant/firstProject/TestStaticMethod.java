package com.itvedant.firstProject;


package MyPackage;

import MyPackage.Student;
import MyPackage.StudentDetails;

//import sun.net.httpserver.simpleserver.resources.simpleserver;

class StudentDetails{  
int rollno;  
String name;  
static String college = "ITS";  
	      
	     static void change(){  
   college = "ITVedant";  
	     }  
   
   StudentDetails(int r, String n){  
   rollno = r;  
   name = n;  
   }  
	     
  void display(){
  	System.out.println(rollno  +" " +  name  + " "+  college);}  
	}  


public class Student2 {

	public static void main(String[] args) {
		StudentDetails.change();
		Student s1 = new Student(111,"Rutuja");
		Student s2 = new Student(122,"Om");
		Student s3 = new Student(165,"Bajirao");
s1.display();
s2.display();
s3.display();
	}

}
