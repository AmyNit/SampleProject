package collectionFramework;

import java.util.List;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {

		/*
		 * Data corruption will not happen Maintains insertion order We can
		 * supply any data since we haven't specified the type of data
		 * 
		 */
		List vector = new Vector<>(); // Vector vector=new Vector();

		vector.add(10);
		vector.add(true);
		vector.add("hello");
		vector.add(9.8);

		System.out.println(vector);

		
		
		
		List<Object> vector1 = new Vector<>();

		vector1.add(10);
		vector1.add(true);
		vector1.add("hello"); //vector.add(String.valueOf("hello")); Internally compiler converts data into object
		vector1.add(9.8);

		System.out.println(vector1);

		
		List<Double> vector2 = new Vector<>(); // double will take integer, float,short,long

		vector2.add(10.9);
		vector2.add(Double.valueOf(20)); // converted to 20.0
		vector2.add(9.8);

		System.out.println(vector2);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
