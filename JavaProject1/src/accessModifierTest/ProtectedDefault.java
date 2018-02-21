package accessModifierTest;

import accessModifiers.AccessModifiers;

public class ProtectedDefault extends AccessModifiers {

	/*
	 * Can access public and protected members only since parent class is on different package when using inheritance
	 * protected members can be accessed here since we are using the reference of child class to create the object 
	 */
	public static void main(String[] args) {

		
		ProtectedDefault obj=new ProtectedDefault();
		obj.test1();
		obj.test2();
		
		System.out.println(obj.i);
		System.out.println(obj.k);
		
		
		
		
		
		
		
		
	}

}
