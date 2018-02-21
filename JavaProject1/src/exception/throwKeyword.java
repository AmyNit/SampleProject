package exception;

public class throwKeyword {

	public static void throwTest1(int age) {

		if(age<18)
			throw new ArithmeticException("you can't vote");
		else
			System.out.println("You can vote");	
		
	}

	public static void throwTest2() {

	}

	public static void main(String[] args) {

		throwTest1(20);
		//throwTest2();

	}

}
