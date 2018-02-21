package javaAdvanced;

public class Constructor {

	
	//global variables or instance variables
	int a;
	int b;

	/*
	 * default constructor
	 * Even if we skip writing this compiler will keep default constructor to the class by default
	 */
   public  Constructor(){
	
	System.out.println("Iam from default constructor");
   }
	
	/*
	 * creating parameterized constructor with 1 argument
	 */
   public  Constructor(int a){
		
	   this.a=a;
	   System.out.println("Iam from parameterized constructor");	
	   }
   /*
    * creating parameterized constructor with 2 arguments
    */
   public  Constructor(int a,int b){
		
	   this.a=a;
	   this.b=b;
	   }
   public  Constructor(String b){
		
	  System.out.println("Iam a string constructor");
	   }
   
   void display(){
	   System.out.println("The value of a:  "+a);
	   
   }
  
   void sum(){
	   int c=a+b;
	   System.out.println("The value of a:  "+a);
	   System.out.println("The value of a:  "+b);
	   System.out.println("The sum is: "+c);
   }
		
	public static void main(String[] args) {
		
	Constructor obj=new Constructor();     //creating object of default constructor
	Constructor obj1=new Constructor(2);   //creating object of parameterized constructor with 1 argument
	Constructor obj2=new Constructor(10,20); //creating object of parameterized constructor with 2 arguments
	Constructor obj3=new Constructor("hello");//creating object of parameterized constructor with string argument
	
	    obj.display();  //calling default constructor, the default value of integer is 0, here a is not initialized
		obj1.display(); //calling parameterized constructor with 1 argument
		obj2.sum(); //calling parameterized constructor with 2 arguments
	}	
}
