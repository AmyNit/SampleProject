package iNterface;

public class InterfaceTest1 implements Interface,iNterface1 {

    void iamFromClass(){
    	
    	
    }
	@Override
	public void test1() {
		// TODO Auto-generated method stub

	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub

	}

	@Override
	public void test3() {
		// TODO Auto-generated method stub

	}

	@Override
	public void test4() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		
	Interface obj=new InterfaceTest1 ();//creating reference of interface. can call interface methods.but can't call methods from the same class
	obj.test1();
	obj.test2();
	obj.test3();
	
	InterfaceTest1 obj1=new InterfaceTest1 ();//creating reference of the class to create objects so that we can call methods from parent & child class as well
	obj1.test1();
	obj1.test2();
	obj1.test3();
	obj1.test4();
	obj1.iamFromClass();
	
	iNterface1 obj2=new InterfaceTest1();//creating reference as iNterface1, can call test4 only since we have only test4 in iNterface1
	obj2.test4();  // can't call methods in child class since we are creating reference of parent class.
	
	
	
	
	
	
	
	
	}}
