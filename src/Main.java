import java.util.*;
import java.io.*;
import java.io.FileWriter;
import java.util.Formatter;
import java.io.IOException;
import java.util.Scanner;
class dataentry implements interface1{
	 String modelname;
	//public String brand name;
	protected double quantity;
	protected double sellingprice;
	protected double buyingprice;
	 protected String done;
	 public void filentry()
	{ 
		try 
		{
	    Formatter formatter = new Formatter ("C:/Users/User/Desktop/inventory/inventory.txt");
		Scanner ob1= new Scanner(System.in);
		System.out.println(" Insert Brand name , quantity , selling price , buying price ");
		System.out.println(" Type 'done' when you want to stop writing ");
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
				
				 System.out.println( i+" "+"PRODUCT Name :" +modelname +"  " + "PRODUCT Quantity: "+ quantity+ " "+"PRODUCT Sellingprice: "+ sellingprice+ " "+ "PRODUCT Buying price: " + buyingprice);
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
interface interface1
{
	void filentry();
}
//import java.util.*;
//import java.io.*;
class calc extends dataentry
{
	private double sum=0;
	private double sum1=0;
	private double sum2=0;
	public void toatlcalulation()
	{  
		try 
		{
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

  class SignUp
 {
     public void signup()
     {
         try
         {
             Scanner input = new Scanner(System.in);
             System.out.print("Enter Your ID: ");
             String ID=input.nextLine();
             System.out.print("Enter Your Password: ");
             String pass=input.nextLine();
             FileWriter obj1 = new FileWriter("C:/Users/User/Desktop/inventory/IDAndPass.txt",true);
             Formatter formatter = new Formatter(obj1);
             formatter.format("%s %s \r\n\n",ID,pass);
             System.out.println("Successfully Done");
             formatter.close();
         }
         catch(IOException e)
         {
             System.out.println("An error occured");
             e.printStackTrace();
         }
     }
 }
//import java.util.*;
//import java.io.*;

class remove extends dataentry{
	ArrayList<String> arrli2 = new ArrayList<String>();
	String line;
	int a;
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
					 arrli2.add(line);
				}
				 
			 bf.close();
			 
			 
		}catch (Exception e)
		{
			System.out.println(e);
		}
		
		for( int i = 0; i<arrli2.size() ; i++)
		{
			System.out.println (arrli2.get(i));
		}
		
		System.out.println(" how many rows you want to delete ");
		Scanner ob2 = new Scanner (System.in);
		int b = ob2.nextInt();
		for ( int j = 0 ; j<b; j++)
		{
		a = ob2.nextInt();
		arrli2.remove(a);
		}
		
		try {
			Formatter formatter = new Formatter ("C:/Users/User/Desktop/inventory/inventory.txt");
			
		for(  int i = 0; i<arrli2.size() ; i++)
		{
			System.out.println (arrli2.get(i));
			 
			 formatter.format("%s\r\n" , arrli2.get(i));
		}
		formatter.close();
		}
		catch (FileNotFoundException e)
		{
			System.out.println(e);
		}
	}
}

		
		
		//import java.io.File;
//import java.util.Scanner;
//import java.io.IOException;
 class LogIn
{
    boolean login;
   
    public void login()
    {   
do{   
    Scanner input=new Scanner(System.in);
   
    System.out.print("Enter Your ID : ");
    String loginID=input.nextLine();
    System.out.print("Enter Your Password : ");
    String loginPass=input.nextLine();
    login=false;
        try
        {
            File obj1=new File("C:/Users/User/Desktop/inventory/IDAndPass.txt");
            Scanner scanner =new Scanner(obj1);
            while(scanner.hasNext())
            {
                String ID=scanner.next();
                String pass=scanner.next();
         
            while(loginID.equals(ID) && loginPass.equals(pass))
            {
                login=true;
                break;
            }
            }
        }
           catch(IOException e)
           {
             System.out.println(e);
           }
        if(login==true)
        {
            System.out.println("LOGIN SUCCESSFUL");
        }
        else
        {
            System.out.println("WRONG!TRY AGAIN");
        }
    }while(login!=true);
  }
}
//import java.util.*;
//import java.io.*;

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
			System.out.println (arrli.get(i));
		}
		
		System.out.println(" ");
		Scanner ob2 = new Scanner(System.in);
		//int B = ob2.nextInt();
		System.out.println(" please insert your product details and type done when you want to stop");
		System.out.println(" ");
		System.out.println(" please insert 'Product name', ' Product quantity', 'Selling price' , 'Buying price' ");
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
			System.out.println (arrli.get(i));
			 
			 formatter.format("%s\r\n" , arrli.get(i));
		}
		formatter.close();
		}
		catch (FileNotFoundException e)
		{
			System.out.println(e);
		}
		
		
		}
	}
//import java.util.Scanner;
//import java.io.IOException;
 class start 
{
    public void home()
    {
        int choose;
        int choosex=0;
        do
        {
            try
            {
                do
                {
        System.out.println("WElCOME TO THE INVENTORY");
        System.out.println("1.CREATE INVENTORY");
        System.out.println("2.REMOVE FROM INVENTORY");
        System.out.println("3.SHOW DETAILS ");
		System.out.println("4.ADD TO INVENTORY");
		System.out.println("5.SHOW INVENTORY");
		System.out.println("6.EXIT");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your choice : ");
        choose = input.nextInt();
        choosex=choose;
		calc data = new calc();
        switch(choose)
        {
            case 1:
		    data.filentry();
            break;
            case 2:
            //cal data = new cal();
            remove re = new remove();
		    re.removedata();
			
            break;
			case 3:
            //cal data = new cal();
            data.toatlcalulation();
            break;
			case 4:
            find fn = new find();
		    fn.addata();
            break;
            case 5:
			data.readfile();
            break;
			
			 case 6:
			
            break;
			
            default:
            System.out.println("NOT APPLICABLE");
        }
                }while(choose!=6);
            }
            catch(Exception e)
            {
                System.out.println("NOT APPLICABLE");
            }
        }while(choosex!=6);
    }
}
//import java.util.Scanner;
//import java.io.IOException;
public class Main
{
    public static void main(String []args)
    {
        int choose;
        int choosex=0;
        do
        {
            try
            {
                do
                {
        System.out.println("WElCOME TO THE HOME PAGE");
        System.out.println("1.Sign Up");
        System.out.println("2.Log in");
        System.out.println("3.Exit");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your choice  : ");
        choose = input.nextInt();
        choosex=choose;
        switch(choose)
        {
            case 1:
            SignUp s1 = new SignUp();
            s1.signup();
            break;
            case 2:
            LogIn l1= new LogIn();
            l1.login();
			start st = new start();
			st.home();
            break;
            case 3:
            break;
            default:
            System.out.println("NOT APPLICABLE");
        }
                }while(choose!=3);
            }
            catch(Exception e)
            {
                System.out.println("NOT APPLICABLE");
            }
        }while(choosex!=3);
    }
}
