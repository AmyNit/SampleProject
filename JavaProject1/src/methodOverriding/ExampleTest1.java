package methodOverriding;

public class ExampleTest1 extends ExampleTest2 {

	public void test1() {

		System.out.println("ExampleTest1  test1()");
	}

	private void test2() {

		System.out.println("ExampleTest1 test2()");
	}

	public static void test3() {

		System.out.println("ExampleTest1  test3()");
	}
/*
 * Can't override final
 */
	/*public final void test4() {

		System.out.println("ExampleTest1 test4()");
	}*/

	public static void main(String[] args) {

	
		ExampleTest1 obj=new ExampleTest1();
		obj.test1();
		obj.test2();
		obj.test4();
	
		ExampleTest1.test3(); // calling static member using class name
	
		System.out.println("------------------------------");
	
		/*
		 * Can't access private members from parent class even if we are using parent class reference to create the object of child class
		 * ExampleTest2 is the reference class.The call happens through parent class during compile time
		 * But during run time the call will happen from the class where object is created.
		 * We are able to call test4 since test1(),test4(),test3() is available in parent class(reference class)
		 */
		ExampleTest2 obj1=new ExampleTest1();
		obj1.test1();
		obj1.test4();
		ExampleTest2.test3(); //calling static member using class name
	
	
	
	
	
	
	}

}
