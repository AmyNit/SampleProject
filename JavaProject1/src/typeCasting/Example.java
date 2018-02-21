package typeCasting;

public class Example {
	
	
	
	public static A test(){
		
		return new A();
	}
	
	
	
	public static void main(String[] args) {
		
	Object obj=test();	 // Object is the super class. so autocasting will be done
	
	
	
	System.out.println(obj.toString());
	
	Object obj1=(Object)test(); // Explicit casting . coverting test() to Object class
	
	System.out.println(obj.toString());
	
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
