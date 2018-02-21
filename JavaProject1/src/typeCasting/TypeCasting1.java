package typeCasting;

public class TypeCasting1 {
	
	public double test1(){
		

		return 2.8;
	}

	public void test2(int i){
		
	System.out.println(i);	


	}
	public void test3(short s){
		
		
    System.out.println(s);
	}

public static void main(String[] args) {

	
	
	
	double d=9.8;
	float f=0;
	long l=90;
	int a = 90;
	short s=0;
	  
	//d=a;  // autocasting or auto indexing, converting d to a . ie converting integer to double(increasing scope)
	
	
	//System.out.println(d);
	
	//a=d; //not possible to convert double to integer like this since we are narrowing the scope of the object
	
	//a=(int)d; // explicit casting, converting 9.8 to 9 ie converting double to integer
	
	//System.out.println(a);
	
	//l=s;
	
	//s=(short)l;
	
	//System.out.println(s);
	
	TypeCasting1 obj1=new TypeCasting1 ();
	
	double data=obj1.test1();
	obj1.test2((int)data); // should be converted to integer before calling since test2 return type is integer and test1 return type is boolean
	                       // we trying to convert boolean to integer through casting
	obj1.test3((short)data); // converting boolean to short through casting
	
	
	
}
	
	



	
	
	
	
	
	
	
	
	
	
	
	

}
