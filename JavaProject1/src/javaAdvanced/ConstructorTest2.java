package javaAdvanced;

public class ConstructorTest2 extends ConstructorTest1 {

	public ConstructorTest2() {

		//super() compiler will keep this as first line of any constructor. so default constructor from parent will be called
		super(5); //parameterized constructor from parent will be called. it will ignore default constructor from parent
		System.out.println("Iam from child default constructor");
	}

	public ConstructorTest2(int a) {
        this(); //call default constructor from the class(0 args), but default constructor first line is super(5).
               //          so it will call parameterized constructor and then the default constructor from same class
		System.out.println("Iam parameterized constructor from child constructor");
	}

	
	public static void main(String[] args) {

		// ConstructorTest2 obj1=new  ConstructorTest2();
	
		ConstructorTest2 obj1=new  ConstructorTest2(2);
	}

}
