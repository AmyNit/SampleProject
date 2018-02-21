package abstarctClass;

/*
 * abstract class
 * can't instantiate abstract class-can't create object for abstract class since all methods have no body.
 * The access of abstract class methods are by default public 
 * We can't narrow down the access of method in abstract class. ie we can't make any method private.
 * Abstract class need not implement all the methods of interface
 */
public abstract  class AbstractClass {



int a=5;


/*
 * Non abstract method,Concrete methods
 */


public void test1(){
	
	
	
}

/*
 * abstract methods
 */
public abstract void test2(); 
public abstract void test3();
abstract void test4();


}