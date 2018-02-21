package javaBasics;

public class StaticAndNonStatic2 {

	
	int i;
	
	static int j;
	
	/*
	 * can call static and non static members directly with in a non static method in same class
	 */
	public void test1(){
		
		 System.out.println(i);
		 System.out.println(j);	
		
	}
	
	/*
	 * non static members can't be called with in a static method directly. static members can be called directly if they are in same class
	 */
   public static void test2(){
		
	   StaticAndNonStatic2 obj=new StaticAndNonStatic2();
	//    System.out.println(i);  can't be called since i is a static member
	   System.out.println(obj.i);  //can call it only by creating an object of the class with in the method where we want to call
	   System.out.println(j);
		
	}
	
	
	
	
	
	
	
}
