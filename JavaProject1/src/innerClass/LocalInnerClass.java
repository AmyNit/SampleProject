package innerClass;

public class LocalInnerClass {

	private int a=90;
	void display(){
		
		class local{
			
			void message(){
			
			System.out.println(a);
		}
		}
	    local l=new local();
	    l.message();
		
	}

	void display1(){
		
		class local{
			
			void message(){
			
			System.out.println("hello");
		}
		}
		local l=new local();
		l.message();
		
	}
	public static void main(String[] args) {
		
		LocalInnerClass obj=new LocalInnerClass();
		
		obj.display();
		obj.display1();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
