package methodOverriding;

public class Example2 extends Example1{

	public void test1(){
		
		System.out.println("Example2 test1()");
	}
	/*
	 * overriding test1() 
	 * Here we create the object of child class and use it to call methods. So child class will get preference
	 * We can't call static,final members from parent class if we using the reference of child class to create objects
	 * We can call static , final members from parent class by using the reference of parent class to create objects
	 */
	public static void main(String[] args) {
		
		
		Example2 obj=new Example2();
		obj.test1();
		obj.test2();
		
		
	}
	
	
	
	
	
}
