package javaBasics;

public class Datatype1 {
	
	
	
   double d=8976.98; 
   float f=987.923F;    //can take non decimal vales
   long l=11111111111L; //can't take decimal values
   int i=1111111111;    //can't take decimal values
   short s;
   byte by;
   char c='A';
   boolean b;
   
  /*
   * Not initializing data type variables 
   */
   double d1; 
   float f1;    //can take non decimal vales
   long l1; //can't take decimal values
   int i1;    //can't take decimal values
   short s1;
   byte by1;
   boolean b1;
   
 
   
   
   
   
   
   
   
   
   
   
   
   /*
    * double is double precision 64-bit, generally used as a default value for decimal values, but should never be used for currency
    * float is single precision 32-bit,mainly used to save memory in large arrays of floating no's, never used for currency
    * long is 64-bit
    * Int is 32 bit
    * boolean represents one bit of information, 2 conditions:true and false
    * char is a single 16-bit unicode character
    * 
    */
	
	public static void main(String[] args) {
		
		
		Datatype1 obj=new Datatype1();
		
		System.out.println(obj.d);
		System.out.println(obj.f);
		System.out.println(obj.l);
		System.out.println(obj.i);
		System.out.println(obj.s);
		System.out.println(obj.by);
		System.out.println(obj.c);
		System.out.println(obj.b);
		
		/*
		 * To get default values
		 * Values are default since we haven't initialized the datatypes
		 */
		System.out.println(obj.d1);
		System.out.println(obj.f1);
		System.out.println(obj.l1);
		System.out.println(obj.i1);
		System.out.println(obj.s1);
		System.out.println(obj.by1);
		System.out.println(obj.b1);
		
		/*
		 * To get the size of the data types
		 * Double is a class
		 */
		System.out.println("double size is"+Double.SIZE);
		System.out.println("float size is"+Float.SIZE);
		System.out.println("long size is"+Long.SIZE);
		System.out.println("int size is"+Integer.SIZE);
		System.out.println("short size is"+Short.SIZE);
		System.out.println("Character size is"+Character.SIZE);
	
		
		/*
		 * To get the minimum and maximum range of values
		 * MIN_VALUE is an API
		 * 
		 */
		
		System.out.println("Double minimum value is"+Double.MIN_VALUE);
		System.out.println("Double maximum value is"+Double.MAX_VALUE);
		
		System.out.println("Float minimum value is"+Float.MIN_VALUE);
		System.out.println("Float maximum value is"+Float.MAX_VALUE);
		
	}	
	

}
