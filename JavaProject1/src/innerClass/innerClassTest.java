package innerClass;

public class innerClassTest {

	  
	int a=30;
	
	public void test2(){
		
		
		System.out.println("I am from outer class");
		
		
	}
	
	
	
	class inner1 {

		public void test1(){
			
			
			
			System.out.println("I am from inner class");
			
			test2(); // can access the member of outer class directly
			System.out.println(a);
		}
	}

	public static void main(String[] args) {

		
		innerClassTest obj=new innerClassTest();
		
		innerClassTest.inner1 inner=obj.new inner1(); // accessing inner class through outer class. can't access inner class directly
		
		inner.test1();
		
		
	//	obj.test2();
		
		
		
		
		
	}

}