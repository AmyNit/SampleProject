package innerClass;

public class anonymousInnerClass {


public static void main(String[] args) {
	
	/*
	 * anonymous inner class. No need to add implementations of interface here.
	 */
	
	Test obj=new Test(){
		
		@Override
		public void run(){
			
			System.out.println("I am running");
		}

		@Override
		public void play() {
		
			System.out.println("I am playing");
			
		}
		
		
	};
	
	obj.run();
	obj.play();
}








}
