import java.io.FileWriter;
import java.util.Formatter;
import java.io.IOException;
import java.util.Scanner;
 public class SignUp
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