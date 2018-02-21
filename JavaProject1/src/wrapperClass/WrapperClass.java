package wrapperClass;

public class WrapperClass {

public static void main(String[] args) {
	
	boolean data;
	int data1;
	double data2;
	char data3;
	short data4;
	long data5;
	float data6;
	byte data7;
	
	/*
	 * converting boolean to Boolean (converting primitive data type to object.Data is converted to object)
	 * a=b=data=true after conversion
	 */
	data=true;
	Boolean b=Boolean.valueOf(data); 
	Boolean a=data;                  //compiler will internally keep Boolean.valueOf() after JAVA 5
	
	System.out.println(a+"  "+b+"    "+data);
	
	/*
	 * Converting int to Integer
	 */
	
	data1=100;
	
	Integer i=Integer.valueOf(data1);
	
	Integer j=data1;
	
	System.out.println(i+"  "+j+"  "+data1);
	
	/*
	 * Converting double to Double
	 */
	
	data2=5609;
	
	Double d=Double.valueOf(data2);
	
	Double d1=data2;
	
	
	System.out.println(data2+" "+d+"  "+d1);
	
		
	Integer p=null; // Integer is a class so it can store null value. int p=null is not possible
	// p can perform many operations
	
	
	
	
	
	
}	
	
}
