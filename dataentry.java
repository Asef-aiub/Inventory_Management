import java.util.*;
import java.io.*;

class dataentry implements interface1{
	 String modelname = null;
	//public String brand name;
	protected double quantity = 0.00;
	protected double sellingprice = 0.00;
	protected double buyingprice = 0.00;
	 protected String done;
	public void filentry(){
		{ 
	    
		
		try {
		Formatter formatter = new Formatter ("C:/Users/User/Desktop/inventory/inventory.txt");
		Scanner ob1= new Scanner(System.in);
		System.out.println(" |||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println(" ||                                                             ||");
		System.out.println(" || Insert Brand name , quantity , selling price , buying price ||");
		System.out.println(" ||         Type 'done' when you want to stop writing           ||");
		System.out.println(" ||                                                             ||");
		System.out.println(" |||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		 while (true)
        {
                    System.out.println(" To exit type done or press any key to continue ");
                    done = ob1.next();
                    if (done.equals("done"))
                        break;
                      System.out.println(" Product name: ");
                      modelname = ob1.next();
            //if (modelname.equals("done"))
           
           
           
            System.out.println(" Product quantity: ");
            quantity = ob1.nextDouble();
            System.out.println(" Product selling price: ");
            sellingprice = ob1.nextDouble();
            System.out.println(" Product buying price: ");
            buyingprice = ob1.nextDouble();
            formatter.format("%s %.2f %.2f %.2f \r\n" ,modelname,quantity,sellingprice,buyingprice);
        }
		
		formatter.close();
		}
		catch (FileNotFoundException e)
		{
			System.out.println(e);
		}
	}
	}
	
	public void readfile()
	 {
		 {  //double sum = 0;
		try {
			File file = new File ("C:/Users/User/Desktop/inventory/inventory.txt");
			 Scanner ob1 = new Scanner (file);
			 int i=1;
			 while ( ob1.hasNext())
			 {   
				 String modelname = ob1.next();
				 quantity = ob1.nextDouble();
			     sellingprice = ob1.nextDouble();
			     buyingprice = ob1.nextDouble();
				 System.out.println("");
				 System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
				
				 System.out.println( i+" "+"PRODUCT Name :" +modelname +" || " + "PRODUCT Quantity: "+ quantity+ " || "+"PRODUCT Sellingprice: "+ sellingprice+ " || "+ "PRODUCT Buying price: " + buyingprice);
				 i++;
				 //sum = sum + price;
			 }
			  System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
			 
			 
		}catch (Exception e)
		{
			System.out.println(e);
		}
	}
	 }
}