package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class TypesOfException extends Test1{

	static String s1;

	public static void arithmeticException() {
		int a = 9 / 0;
	}

	public static void nullPointerException() {
		System.out.println(s1.concat("test"));
	}

	public static void stackOverFlowException() {
		ArrayList<Integer> array = new ArrayList<Integer>();
		while (true) {
			array.add(10);
		}
	}

	public static void numberFormatException() {

		String s1 = "test";
		int t = Integer.parseInt(s1);

	}

	public static void fileNotFoundException() throws FileNotFoundException {
		FileReader f = new FileReader("c:/Ammu");
	}

	public static void classNotFoundException() throws ClassNotFoundException {

		Class.forName("notexistingclass");
	}

	public static void illegalArgumentException(int a) {

		// int a=b+b;

	}

	public static void arrayIndexOutOfBoundException() {

		int[] a = new int[5];
		System.out.println(a[6]);

	}

	public static void outOfMemoryException() {

		long data[] = new long[1000000000];
	}

	public static void classCastException() {

		Test1 obj1=new Test1();
		System.out.println((TypesOfException)obj1);
	}
	
	public static void illegalStateException() {

		String s="hello";
		
		Scanner scanner=new Scanner(s);
		
		System.out.println(scanner.nextLine());
		scanner.close();
		System.out.println(scanner.nextLine());
		
		
	}

	public static void main(String[] args) throws Exception {

		// arithmeticException();
		// nullPointerException();
		// stackOverFlowException();
		// numberFormatException();
		// fileNotFoundException();
		// classNotFoundException();
		// illegalArgumentException();
		// arrayIndexOutOfBoundException();
		// outOfMemoryException();
		//classCastException();
		//illegalStateException();
		
	}
}