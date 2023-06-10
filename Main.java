import java.util.Scanner;
import java.io.IOException;
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
					
		System.out.println(" |||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println(" ||                                                             ||");
		System.out.println(" ||             WElCOME TO THE HOME PAGE                        ||");
		System.out.println(" ||                                    MAD CMD presents         ||");
		System.out.println(" ||                                                             ||");
		System.out.println(" |||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("           ");
        System.out.println("                                1.Sign Up");
        System.out.println("                                2.Log in");
        System.out.println("                                3.Exit");
		System.out.println("           ");
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
