package javaBasics;

public class SIBandIIB {

	static int i;
	int j;
	
	static {
       
		i=10;
		System.out.println("Iam from SIB 1");
	}
	static {
		System.out.println("Iam from SIB 2");
	}
	{
		j=20;
		System.out.println("Iam from IIB 1");
	}
	{
		System.out.println("Iam from IIB 2");
	}
	
	public static void main(String[] args) {
	
	
		SIBandIIB obj1=new SIBandIIB();
		SIBandIIB obj2=new SIBandIIB();
	
	System.out.println(SIBandIIB.i); // or System.out.println(i);
	System.out.println(obj1.j);
	
	
	
	
	
	
	
	
	}
	
	
	
}
