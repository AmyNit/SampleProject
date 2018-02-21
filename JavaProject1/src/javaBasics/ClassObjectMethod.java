package javaBasics;

public class ClassObjectMethod {
	
	
	int height;
	int weight;
	
	public void walk(){
	
		System.out.println("walking");
		
	}
	
	
    public void eat(){
		
		System.out.println("eating");
	}
	
	public static void main(String[] args) {
		
		ClassObjectMethod obj1=new ClassObjectMethod();
		obj1.walk();
		obj1.eat();
		
	System.out.println(obj1.height);
	System.out.println(obj1.weight);
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
