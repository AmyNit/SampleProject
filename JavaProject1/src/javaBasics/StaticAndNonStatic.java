package javaBasics;

public class StaticAndNonStatic {

	
int i;
int j;

static int p;
static int k;

public void test1(){
	
	System.out.println("test1 non static");
}
	
public static void test2(){
	
	System.out.println("test2 static");
}
	
public void test3(){
	
	System.out.println("test3 non static");
}
public static void test4(){
	
	System.out.println("test4 static");
}
	
		
	public static void main(String[] args) {
	
		
		StaticAndNonStatic obj=new 	StaticAndNonStatic();
		obj.test1();
		obj.test3();
		System.out.println(obj.i);
		System.out.println(obj.j);
		
		StaticAndNonStatic.test2();
		StaticAndNonStatic.test4();
		System.out.println(StaticAndNonStatic.k);
		System.out.println(StaticAndNonStatic.p);
		
		
		
		
	}		
	
	
	
	
}
