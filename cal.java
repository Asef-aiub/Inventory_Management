import java.util.*;
import java.io.*;
 class cal extends dataentry{
	private double sum=0;
	private double sum1=0;
	private double sum2=0;
	 public void toatlcalulation()
	 {
		  
		 
		try {
			File file = new File ("C:/Users/User/Desktop/inventory/inventory.txt");
			 Scanner ob1 = new Scanner (file);
			 
			 while ( ob1.hasNext())
			 {   
				 String modelname = ob1.next();
				 quantity = ob1.nextDouble();
			     sellingprice = ob1.nextDouble();
			     buyingprice = ob1.nextDouble();
				 System.out.println("");
				 
			     sum1= sum1+quantity;
				 sum = sum + sellingprice*quantity;
				 sum2 = sum2 + buyingprice*quantity;
			 }
			 double interest = (sum - sum2);
			 
			 System.out.println("total estimated sellingprice"+" "+ sum);
			 System.out.println("  ");
			 System.out.println("total amount of product"+" "+ sum1);
			 System.out.println(" ");
			 System.out.println("total cost"+" "+ sum2);
			 System.out.println(" ");
			 System.out.println("total interest"+" "+ interest);
			 
		}catch (Exception e)
		{
			System.out.println(e);
		}
	}
	 
		 
	 }
 