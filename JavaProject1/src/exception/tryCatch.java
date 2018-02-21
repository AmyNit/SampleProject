package exception;

public class tryCatch {

	public void syntax() {

	}

	public static void arithmeticException() {

		try {
			int b = 9 / 0;
		} catch (Exception e) {
			System.out.println("Arithmetic test failed");
			e.printStackTrace();
		}
	}

	/*
	 * change values of array and check checks from right
	 */
	public static void multipleCatchBlock() {

		try {
			int[] a = new int[200];
			a[2] = 5 / 1;

			// Class.forName("hello");

		} catch (ArithmeticException e) {

			System.out.println("Geting arithmetic Exception");
		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Geting arrayIndexOutOfBounds Exception");

		} catch (NullPointerException e) {

			System.out.println("Getting null pointer exception");
		} catch (Exception e) {

			System.out.println("we are done");
			e.printStackTrace();

		}

		System.out.println("rest of code");
	}

	
	
	
	
	public static void multipleTryBlock() {

		try {
			try {
				int[] a = new int[5];
				a[5] = 5 / 0;
			} catch (Exception e) {

				System.out.println("Iam from inner try");
				throw new ArithmeticException("Iam from Arithmetic exception");
			}

		} catch (ArithmeticException e) {

			System.out.println("Geting arithmetic Exception");
		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Geting arrayIndexOutOfBounds Exception");

		} catch (NullPointerException e) {

			System.out.println("Getting null pointer exception");
		} catch (Exception e) {

			System.out.println("we are done");

		}

		System.out.println("rest of code");
	}

	
	
	
	
	public static void nestedtry() {

		try {
			try {
				
				System.out.println("going to divide");
				
			int b = 9 / 0;
			
			} catch (ArithmeticException e) {
			
				System.out.println(e);
				
				throw new ArithmeticException("iam from arithmetic exception");
			}
			
			try {
				int a[]=new int[5];
				a[5]=4;
			} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println(e);
			}
			System.out.println("other statements");
			
		} catch (Exception e) {
	
			System.out.println("Exception handled");
		}
		
		System.out.println("normal flow");

	}

	public static void main(String[] args) {

		//arithmeticException();
		// multipleCatchBlock();
		//multipleTryBlock();
		//nestedtry();

	}

}
