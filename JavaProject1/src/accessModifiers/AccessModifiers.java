package accessModifiers;

public class AccessModifiers {

	public int i;
	private int p;
	protected int k;
	int d;

	public void test1() {

		System.out.println("public void test1()");
	}

	protected void test2() {

		System.out.println("protected void test2()");
	}

	void test3() {
		System.out.println("void test3()");
	}

	private void test4() {
		System.out.println("private void test4()");

	}
	
	/*
	 * We can access all members no matter what type of access they have if we are in same class
	 */
	public static void main(String[] args) {
		
		
		AccessModifiers obj=new AccessModifiers();
		
		obj.test1();
		obj.test2();
		obj.test3();
		obj.test4();
		
		System.out.println(obj.p);
		System.out.println(obj.d);
		System.out.println(obj.i);
		System.out.println(obj.k);
		
		
	}

}
