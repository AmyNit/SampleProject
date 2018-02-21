package inheritance;

public class B extends A {
	
	/*
	 * We can't inherit private members 
	 * public,default,protected members can be inherited if the parent and child class are on same package
	 */
	public static void main(String[] args) {
		
		
	B obj=new B();
	obj.test2();
	obj.test4();
	obj.test5();
	
	
	System.out.println(obj.i);
	System.out.println(obj.k);	
	System.out.println(obj.p);
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
