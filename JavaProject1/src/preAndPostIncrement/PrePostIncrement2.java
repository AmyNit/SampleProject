package preAndPostIncrement;

public class PrePostIncrement2 {

	
	public static void main(String[] args) {
	
		int i = 0;
	    int j = 0;
	
	
	   System.out.println(i); //print i as 0
	   System.out.println(j); //printj as 0
	   
	   System.out.println(++i); //Increment i to 1 and print i as 1
	   System.out.println(++j); //Increment j to 1 and print j as 1
	   
	   System.out.println(i++); //i is 1 in memory now. so print i as 1 and increment i to 2
	   System.out.println(j++); //j is 1 in memory now. so print j as 1 and increment j to 2
	   
	   System.out.println(i); // i is 2 in memory now. so print i as 2
	   System.out.println(j); // j is 2 in memory now. so print j as 2
	   
	}	

}
