import java.io.File;
import java.util.Scanner;
import java.io.IOException;
public class LogIn
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