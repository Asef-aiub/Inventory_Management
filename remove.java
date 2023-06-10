import java.util.*;
import java.io.*;

class remove extends dataentry{
	String arrli2[] = new String[100];
	String line;
	int a;
	int k = 0;
	public void removedata()
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
					 for(int i=0;i<arrli2.length;i++)
							if(arrli2[i]==null)
							{
								arrli2[i]=line;
								break;
				            }
				}
				 
			 bf.close();
			 
			 
		}catch (Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println ( " product you have ");
		for( int i = 0; i<arrli2.length ; i++)
		{
			
			
			if (arrli2[i] != null)
            {
				System.out.println ( " " );
			    System.out.println ( "---------------------------------------------------------------");
				System.out.println ("  ("+ (i) + ") "+ arrli2[i]);
			}
			
			
		}
		    System.out.println ( "---------------------------------------------------------------");
		System.out.println ( "    ");
		System.out.println(" how many rows you want to delete ");
		System.out.println ( "    ");
		Scanner ob2 = new Scanner (System.in);
		int b = ob2.nextInt();
		System.out.println ( "    ");
		System.out.println(" which row you want to delete ");
		//String deleted[] =new String[];
		for ( int j = 0 ; j<b; j++)
		{
			//for(int i=0;i<arrli2.length;i++)
				a = ob2.nextInt();
					//if(deleted[i]==null){deleted[i]= a ;}
			arrli2[a]= null;
		}
		
		/* for ( int j = 0 ; j< arrli2.length; j++)
		{
			
					
					
			if (arrli2[j] == null)
            {
				break;
			}				
				    System.out.println(
			
		}*/
		
		
		
		try {
			Formatter formatter = new Formatter ("C:/Users/User/Desktop/inventory/inventory.txt");
			
		for(  int i = 0; i<arrli2.length; i++)
		{
			
			if (arrli2[i] != null)
            {
				
				System.out.println ( "   ");
			System.out.println ( " -------------------------------------------------------------------");
				System.out.println ("  ("+ k + ") "+ arrli2[i]);
			 k++;
			 formatter.format("%s\r\n" , arrli2[i]);
			}	
			
		}
		System.out.println ( "------------------------------------------------------------------------");
		formatter.close();
		}
		catch (FileNotFoundException e)
		{
			System.out.println(e);
		}
	}
}

		
		
		