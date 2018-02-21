package javaAdvanced;

public class ThisKeyword2 {
	
	
	int a;
	int b;
	int c;
	int d;
	
	public void test1(int a, int b){
		
		a=a;
		b=b;
	}
	
public void test2(int c, int d){
		
		this.c=c;
		this.d=d;
	}
	
	public void display(){
		
		System.out.println("The value of a and b are"+a+","+b);
	}
	
public void display1(){
		
		System.out.println("The value of c and d are"+c+","+d);
	}
	
	
	public static void main(String[] args) {
		
		
		ThisKeyword2 obj=new ThisKeyword2();
		obj.test1(2, 4); 
		obj.display();  // a and b is 0 since JVM can't distinguish local and global variable. the defau;t value of int is 0
		obj.test2(7, 8); 
		obj.display1(); //Here this keyword helps JVM to recognize local and global variables
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
