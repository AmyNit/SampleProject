package preAndPostIncrement;

public class PrePostIncrement1 {
	
	
	
	public static void main(String[] args) {
		
		
		int i=0;
		int j=0;
		int a=0;
		int b=0;
		
		
		/*
		 * pre Increment
		 */
		System.out.println(++i); //print i as 1
		System.out.println(++j); //print j as 1
		
		/*
		 * Post Increment
		 */
		
        System.out.println(a++); //print a as 0
		System.out.println(b++); //print b as 0
		
		/*
		 * The value get incremented by 1 in memory
		 */
		System.out.println(a); //print a as 1
		System.out.println(b); //print b as 1
		}}
