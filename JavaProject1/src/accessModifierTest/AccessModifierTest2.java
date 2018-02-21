package accessModifierTest;

import accessModifiers.AccessModifiers;

public class AccessModifierTest2 extends AccessModifiers {
	
	/*
	 * public members can only be accessed since we are using the reference of parent class to create the object
	 */
	public static void main(String[] args) {
		
		
		AccessModifiers obj=new AccessModifiers(); // or	AccessModifiers obj=new AccessModifierTest2();
		//obj.test1();
		
		System.out.println(obj.i);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
