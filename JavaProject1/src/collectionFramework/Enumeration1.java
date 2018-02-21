package collectionFramework;

import java.util.Enumeration;
import java.util.Vector;

public class Enumeration1 {
	
	
	public static void main(String[] args) {
		
		
		Vector<Integer> vector=new Vector<>();
		
		vector.add(2);
		vector.add(200);
		vector.add(8);
		vector.add(20);
		vector.add(10);
		
		
	Enumeration<Integer> enu = vector.elements();
	
	while(enu.hasMoreElements())
	{
		
		System.out.println(enu.nextElement());
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
