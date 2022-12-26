package collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class enumrationClass {
	
	public static void main(String[] args) {
		
		Vector v=new Vector();
		
		List l=new ArrayList();
		
		v.add(10);
		v.add(10);
		
		v.add("shubham");
		
		Enumeration e=v.elements();
		
		 while (e.hasMoreElements()) {
			 
			System.out.println(e.nextElement());
		}
		
	}

}
