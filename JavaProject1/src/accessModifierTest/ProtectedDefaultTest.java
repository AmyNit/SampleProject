package accessModifierTest;

import accessModifiers.AccessModifiers;

public class ProtectedDefaultTest {

		/*
		 * Can access public members only since parent class is on different package without inheritance
		 */
		public static void main(String[] args) {

			
			AccessModifiers obj=new AccessModifiers();
			obj.test1();
			
			System.out.println(obj.i);

			
			
			
}
}