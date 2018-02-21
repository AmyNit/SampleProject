package typeCasting;

public class TypeCasting2 extends C{

	
	public void test1(C obj){
		
		obj.add();
	}
   
	public void test2(A obj){
		
		obj.add();
	}
	
	

	
	
	public static void main(String[] args) {
		
		
		
	 A a=new C(); // making the reference of A(parent class) & object of C(child class)->auto casting
	 a.add(); //Method call will happen from C Since we have created the object of C and use it to call the method->polymorphism
		
	
     A a1=(A)new C(); // Explicit casting. casting the object to A.Output remains same as above since child class has add()
	 a1.add();//a1.add2() is not available since during compile time it look method in reference class
	 
	
	 a1.add1();      //call happens from parent since child doesn't have add1()
	 
	 /*Note:At compile time, method call happens from reference class. but at run time it will first check in child class
	  * If the method is present in child class, it will be called. else, the method from parent class will be called
	  * 
	  */
		
		C a2=new C();
		a2.add2(); // a2.add() is available since we create the reference of C
	 
	 
		
	
	}
	
	
	
	
	
	
}
