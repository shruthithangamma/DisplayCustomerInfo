//Added to Github
import java.util.Scanner;
public class CustomerApp
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int custNumber = 0;
		String choice = "y";
		Scanner sc = new Scanner(System.in);
       System.out.println("Welcome to Customer Application");
       while(choice.equalsIgnoreCase("y")){
    	   
    	   System.out.println("Enter Customer number: ");
    	 int custNumber = sc.nextInt();
      
       try{
    	   Customer cust = CustomerIO.getCustomer(custNumber);
    	   System.out.println(cust.getNameAndAddress());
    	   }
       
       catch(NoSuchCustomerException nce){
    	   System.out.println("Error!"+nce.getMessage());
    	   
       }
       System.out.print("Continue? (y/n): ");
       choice = sc.next();
       
       } 
      sc.close(); 
	}
}

