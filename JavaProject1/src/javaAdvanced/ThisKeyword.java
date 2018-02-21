package javaAdvanced;

public class ThisKeyword {

	
	int a; //global variables
	int b;
	int c;
	static int d;
	
	
	ThisKeyword(){
		
	System.out.println("Iam default constructor");
	}
	/*
	 * constructor with 1 argument
	 */
	ThisKeyword(int a,int b){
		
		this(); // calls default constructor
		this.a=a;
		this.b=b;
	}
	/*
	 * constuctor with 3 arguments
	 */
   ThisKeyword(int a,int b,int c){
		
		this(a,b); // calls constructor with 2 agruments
		this.c=c;
	}
	 public void display(){
		 
		 System.out.println("The value of a,b,c is"+a+b+c);
		 
	 }
	
	public static void main(String[] args) {
		
		ThisKeyword obj=new ThisKeyword(1,2,3); //JVM will look for constructor with 2 args of type integer,a will be 1 & b will be 2
		obj.display();
	}
	
	
	
}
