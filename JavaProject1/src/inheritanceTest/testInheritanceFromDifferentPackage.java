package inheritanceTest;

import inheritance.A;

public class testInheritanceFromDifferentPackage extends A {
	
	/*
	 * We can't inherit default members or private members from different package
	 * We can access only public,protected members
	 */
	
	
	public void hello(){
		
		
	}
	public static void main(String[] args) {
		
	
	testInheritanceFromDifferentPackage obj=new testInheritanceFromDifferentPackage();
	
	obj.test2();
	obj.test4();

	
	System.out.println(obj.i);
	System.out.println(obj.k);
	/*
	 * We can't access child class methods if we are using the reference of parent class to create objects. if same methods are available in parent class we can call methods from child class
	 */
	A obj1=new testInheritanceFromDifferentPackage(); // can't access test()4 since we can't access protected members if we are creating the reference of parent class to create objects
	obj1.test2();
	

	
	}
	
	
	
	
	
	
	

}
