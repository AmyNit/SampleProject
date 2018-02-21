package thisKeyword;

public class ThisKeyword1 {

	int a;
	int b;
	int c;
	static int d;

	/*
	 * this is available only for non static members
	 */
	public void test1() {

		this.test2(); // since test1 is non static it can access static methods
						// and non static instance varibales
		System.out.println("I am test one");
	}

	public void test2() {
		System.out.println("I am test two");
	}

	/*
	 * this is not available to this method since test3 is static and this is
	 * not available for static members
	 */
	public static void test3(int a) {

		System.out.println("I am test three");
	}

	/*
	 * Here we have obj of type ThisKeyword1(classtype)
	 */
	public void test4(ThisKeyword1 obj) {
		System.out.println("method 4 is invoked");
		System.out.println(obj.getClass().getName());
	}

	/*
	 * 
	 */
	public void test5() {
		test4(this);  //calls the constructor with argument class which is test4(ThisKeyword1 obj)
		test3(4);     
	}
	
	public static void main(String[] args) {
		
		
		ThisKeyword1 obj=new ThisKeyword1();
		
		obj.test5();
		obj.test1();
		
		
		
		
	}

}
