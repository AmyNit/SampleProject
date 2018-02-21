package javaAdvanced;

public class MethodOverloading2 {

	public void test1() {

		System.out.println("test1()");
	}

	public void test1(int i) {

		System.out.println("test1(int i)");
	}

	public void test1(int i, int j) {

		System.out.println("test1(int i,int j)");
	}

	public void test1(int i, int j, int k) {

		System.out.println("test1(int i,int j,int k)");

	}
	/*
	 * using different data type for arguement
	 */
	public void test1(double i) {  

		System.out.println("test1(double i)");
	}

	public void test1(double i, int j) {

		System.out.println("test1(double i,int j)");
	}


	
	public static void main(String[] args) {
		
		MethodOverloading2 obj=new MethodOverloading2();
		obj.test1(1.0, 1);   //last method is called since we pass double & int
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
