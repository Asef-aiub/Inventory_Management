

import java.util.Scanner;
import java.io.IOException;
public class start 
	
	/*public static void main ( String[] args)
	{
		cal data = new cal();
		data.filentry();
		data.readfile();
		data.toatlcalulation();
		find fn = new find();
		fn.addata();
		remove re = new remove();
		re.removedata();
		
    }
}*/



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
					
		System.out.println(" |||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println(" ||                                                             ||");
		System.out.println(" ||               WElCOME TO THE INVENTORY                      ||");
		System.out.println(" ||                                                             ||");
		System.out.println(" ||                                                             ||");
		System.out.println(" |||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("       ");
		
		System.out.println(" |||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println(" ||                          1.CREATE INVENTORY                 ||");
        System.out.println(" ||                          2.REMOVE FROM INVENTORY            ||");
        System.out.println(" ||                          3.SHOW DETAILS                     ||");
		System.out.println(" ||                          4.ADD TO INVENTORY                 ||");
		System.out.println(" ||                          5.SHOW INVENTORY                   ||");
		System.out.println(" ||                          6.EXIT                             ||");
		System.out.println(" |||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println("       ");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your choice : ");
        choose = input.nextInt();
        choosex=choose;
		cal data = new cal();
		
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
