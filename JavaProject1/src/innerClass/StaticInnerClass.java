package innerClass;

public class StaticInnerClass {


static int a=100;

static class class1{
	
	void message(){
		
		System.out.println(a);
	}}

public static void main(String[] args) {
	
	StaticInnerClass.class1 inner=new StaticInnerClass.class1(); // since inner class is static and it can be directly accessed using classname
	inner.message();
	
	
}








}
