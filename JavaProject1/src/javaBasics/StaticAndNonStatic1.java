package javaBasics;

public class StaticAndNonStatic1 {

	
	public static void main(String[] args) {
		
		
		StaticAndNonStatic obj=new StaticAndNonStatic();
		
		obj.test1();
		obj.test3();
		
		StaticAndNonStatic.test2();
		StaticAndNonStatic.test4();
		/*
		 * The newly created objects new StaticAndNonStatic(); will be stored in heap memory every time
		 * The references will be stored in stack memory
		 * We are using some heap memory to create objects every time a non static member is called.
		 * 
		 */
		StaticAndNonStatic obj1=new StaticAndNonStatic();
		
		obj1.test1();
		obj1.test3();
		
        StaticAndNonStatic obj2=new StaticAndNonStatic();
		
		obj2.test1();
		obj2.test3();
		
		
		
	}
	
	
	
	
	
	
	
}
