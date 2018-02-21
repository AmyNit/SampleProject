package exception;

public class FinallyBlock {

	
	
	/*
	 * finally block will always be executed even if there is exception or no exception
	 */
	public static void finallyBlock1() {

		try {
			
			int a=5/0;
			
			System.out.println("dividing");
			

		} catch (ArithmeticException e) {

			e.printStackTrace();
			
		} finally {

			System.out.println("Iam from finally block1");

		}
		
		System.out.println("rest of code");
	}

	/*
	 * we can write try block with out catch if there is finally block
	 */
	public static void finallyBlock2() {

		try {
			
			int a=5/0;

		} finally {

			System.out.println("Iam from finally block1");

		}
	}

	public static void main(String[] args) {

		finallyBlock1();
		//finallyBlock2();
	}

}
