package abstarctClass;

/*
 * Abstract class has some unimplemented methods that should be implemented before extending it
 */
public class A extends AbstractClass {

	@Override
	public void test2() {
		// TODO Auto-generated method stub

	}

	@Override
	public void test3() {
		// TODO Auto-generated method stub

	}
	@Override
	void test4() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		
		/*
		 * Creating reference of child class
		 */
		A obj = new A();
		obj.test2(); // can access abstract methods
		obj.test1();
		obj.test3();
		obj.test4();
		System.out.println(obj.a);
		
		/*
		 * creating reference of parent class
		 */
		
		
		/*
		 * Creating object Through parent class(abstarct class) reference
		 */
		AbstractClass obj1=new A();
		
		
		obj1.test1();
		obj1.test2();
		obj1.test3();
		obj1.test4();
		
		// can't create the object of abstract class
		
		
		
		
		
		
	}

	

}
