import java.util.*;
import java.io.*;

class find extends dataentry {
	ArrayList<String> arrli = new ArrayList<String>();
	String line;
	String a;
	public void addata()
	{
		 
		try {
			FileReader file = new FileReader ("C:/Users/User/Desktop/inventory/inventory.txt");
			BufferedReader bf = new BufferedReader (file);
			
				if (!bf.ready())
				{
					
				filentry();
						 
				}
				 while ( (line = bf.readLine())!= null)
				{   
					 arrli.add(line);
				}
				 
			 bf.close();
			 
			 
		}catch (Exception e)
		{
			System.out.println(e);
		}
		
		for( int i = 0; i<arrli.size() ; i++)
		{
			System.out.println ( " " );
			System.out.println ( "---------------------------------------------------------------");
			System.out.println ("  ("+ i + ") "+arrli.get(i));
		}
		System.out.println ( "---------------------------------------------------------------");
		System.out.println(" ");
		Scanner ob2 = new Scanner(System.in);
		//int B = ob2.nextInt();
		System.out.println("***********************************************************************************");
		System.out.println("**                                                                               **");
		System.out.println("** please insert your product details and type done when you want to stop        **");
		System.out.println("**                                                                               **");
		System.out.println("** Insert 'PRODUCT NAME', ' PRODUCT QUANTITY', 'SELLING PRICE' , 'BUYING PRICE'  **");
		System.out.println("**                                                                               **");
	    System.out.println("***********************************************************************************");
		int i = arrli.size();
		
		while (true)
		{
			
			a = ob2.nextLine();
			if ( a.equals("done"))
			{
				break;
			}
			else
			{
			arrli.add(i,a);
			}
			i++;
			
		}
		
		try {
			Formatter formatter = new Formatter ("C:/Users/User/Desktop/inventory/inventory.txt");
			
		for(  i = 0; i<arrli.size() ; i++)
		{
			System.out.println ( " " );
			System.out.println ( "---------------------------------------------------------------");
			System.out.println (arrli.get(i));
			 
			 formatter.format("%s\r\n" , arrli.get(i));
		}
		    System.out.println ( "---------------------------------------------------------------");
		formatter.close();
		}
		catch (FileNotFoundException e)
		{
			System.out.println(e);
		}
		
		
		}
	}
