package abc;

import java.util.Scanner;

public class ArrayOfObjects {
	
	int pro_Id;  
	String pro_name; 
	
	
	public ArrayOfObjects(int pid, String n) {
		
		pro_Id = pid;  
		pro_name = n;  
		
	}
	
	public void display()  
	{  
	System.out.print("Product Id = "+pro_Id + "  " + " Product Name = "+pro_name);  
	System.out.println();  
	}  
		public static void main(String args[])  
		{  
			
			Scanner sc=new Scanner(System.in);
		//create an array of product object   
		ArrayOfObjects[] obj = new ArrayOfObjects[5] ;  
		//create & initialize actual product objects using constructor  
		System.out.println("Enter Product details");
		obj[0] = new ArrayOfObjects(sc.nextInt(),sc.nextLine());  
		obj[1] = new ArrayOfObjects(sc.nextInt(),sc.nextLine());  
		obj[2] = new ArrayOfObjects(sc.nextInt(),sc.nextLine());  
		obj[3] = new ArrayOfObjects(sc.nextInt(),sc.nextLine());  
		obj[4] = new ArrayOfObjects(sc.nextInt(),sc.nextLine());  
		//display the product object data  
		System.out.println("Product Object 1:");  
		obj[0].display();  
		System.out.println("Product Object 2:");  
		obj[1].display();  
		System.out.println("Product Object 3:");  
		obj[2].display();  
		System.out.println("Product Object 4:");  
		obj[3].display();  
		System.out.println("Product Object 5:");  
		obj[4].display();  
		
		
		
		
		}  
		}  
		//Product class with product Id and product name as attributes  
		
