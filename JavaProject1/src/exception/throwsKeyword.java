package exception;

import java.io.IOException;

public class throwsKeyword {

	/*
	 * Exception can be propagated. Here exception get propagated to test2().
	 * Exception can be handled in test1(), then it won't be propagated.
	 * Anything wrriten after throw new IO Exception will not be executed
	 */

	public static void test1() throws IOException {

		throw new IOException("IO Error");

	}

	public static void test2() throws IOException {

		test1();
		System.out.println("hello");// won't be executed when we call test2()
									// since the control goes to test1()
	}

	/*
	 * Handling exception using try-catch block.Here exception is not propagated
	 * to test3. Wen test2() is called , since it throws IO Exception , it is
	 * handled in catch block. so catch block will be executed
	 */

	public static void test3() {

		try {
			test2();

		} catch (IOException e) {
			System.out.println("Exception handled");
		}
		System.out.println("test is running");
	}

	public static void main(String[] args) throws IOException {

		// test2();
		//test3();
		System.out.println("----------------");
		test1();
	}

}
