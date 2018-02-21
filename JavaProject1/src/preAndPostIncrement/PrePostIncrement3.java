package preAndPostIncrement;

public class PrePostIncrement3 {

	
	public static void main(String[] args) {
		
	int i=0;
	int j=0;
	
	int k=j++; //use j value 0 and store in k and 
	int m=++i;
	
	System.out.println(k); //print k as o
	System.out.println(m); //print m as 1
	System.out.println(j); //print j as 1 since j got incremented to 1 from 0 after j++
	System.out.println(i); //print i as 1 since i got incremented already by ++i
		
		
		
		
	}
	
	
	
	
	
	
	
}
