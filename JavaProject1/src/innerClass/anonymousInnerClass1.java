package innerClass;

public class anonymousInnerClass1 {

	
	public void test1(){
		
		
		abstractClass obj=new abstractClass(){

			@Override
			public void study() {
				
				
				System.out.println("Iam studying");
			}
			};
		
		obj.study();
		}
	
	public static void main(String[] args) {
		
		
		anonymousInnerClass1 obj2=new anonymousInnerClass1();
		obj2.test1();
	}
	
	
	

}
