package org.sample;

public class Demo {
  private static int empid( int a,int b) {
	  System.out.println(a+b);
	  return a+b;

}public static void main(String[] args) {
	Demo d = new Demo();
	d.empid(10, 20);
	try {
		System.out.println(empid(10, 10)/2);
	} catch (Exception e) {
		System.out.println("exception handled");
	}
	try {
		System.out.println(empid(10, 10)/2);
	} catch (Exception e) {
		System.out.println("exception handled");
	}
	

//	
	
	
	
}
	
	
	
	
}
