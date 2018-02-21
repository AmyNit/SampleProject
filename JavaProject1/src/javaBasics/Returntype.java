package javaBasics;

public class Returntype {

	public void test1() {

		System.out.println("test1 void return type");
	}

	public int test2() {

		System.out.println("test2 int return type");

		return 2;
	}

	public double test3() {

		System.out.println("test3 double return type");

		return 11.2;
	}
	public boolean test4() {

		System.out.println("test4 boolean return type");

		return true;
	}
	public String test5() {

		System.out.println("test5 String return type");

		return "akksk";
	}

	
	public char test6() {

		System.out.println("test6 character return type");

		return 'c';
	}
/*
 * Return type is array. so we should return the object of the array
 */
	public int[] test7() {

		System.out.println("test7 1 dimensional return type");

		return new int[3];
	}
	public int[][] test8() {

		System.out.println("test8 2 dimensional array return type");

		return new int[3][4];
	}
	
	/*
	 * we should return the object of the class if return type  is class
	 */
	public  Returntype test9() {

		System.out.println("test9 class return type");

		return new Returntype() ;
	}
	
	
	public static void main(String[] args) {
		
		int[]a=new int[3];  //single dimensional array of integers
		
		int[][]b=new int[3][4]; //2 dimensional array
		
		Returntype obj=new Returntype();
		obj.test1();
		obj.test2();
		obj.test3();
		obj.test4();
		obj.test5();
		obj.test6();
		obj.test7();
		obj.test8();
		obj.test9();
		
	}
	
	
	
	
	
	
	
	
	
	
}
