import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.RowFilter.Entry;

public class AtmInterface extends Account{
    Scanner sc=new Scanner(System.in);
    DecimalFormat cashformat=new DecimalFormat("'$' ### , ##0.00");
    HashMap<Integer,Integer> data=new HashMap<Integer,Integer>();
    public void login() throws IOException{
        int x=1;
        do{
            try{
                data.put(952141,191904);
                data.put(6,2);
                System.out.println("Welcome to the Atm Project");
                System.out.println("Enter your customer Number");
                setCustomerNumber(sc.nextInt());
                System.out.println("Enter your pin Number ");
                SetPinNumber(sc.nextInt());


            }
            catch(Exception e){
                System.out.println("\n"+"Invalid charcter(s).ONly Numbers."+"\n");
                x=2;

            }
            int cn=getCustomerNumber();
            int pn=getPinNumber();
            
            
            if(data.containsKey(cn)&& data.get(cn)==pn)
            {
                getAccountType();
            }
            else{
                System.out.println("\n"+ "Wrong customer number of Pin number"+"\n");
            }
        }while(x==1);

    }
    public void getAccountType(){
        System.out.println("Select the Account type you want to Access");
        System.out.println("1)  Checking Account");
        System.out.println("2)  Saving Account");
        System.out.println("3)  Exit ");
        int select=sc.nextInt();
        switch(select)
        {
            case 1: getChecking();
            break;
            case 2: getSaving();
            break;
            case 3: System.out.println("Thank you visiting, Visiting again");
            break;
            default: System.out.println("\n"+ "Invalid choice"+"\n");
            getAccountType();

        }
    }
    public void getChecking()
    {
        System.out.println("Checking Account......");
        System.out.println("1)  View Balance");
        System.out.println("2)  Withdraw Funds");
        System.out.println("3)  Deposit funds");
        System.out.println("4)  Exit");
        System.out.print("Choice:  ");
        int select =sc.nextInt();
        switch(select)
        {
            case 1: System.out.println("Checking the Account Balance:"+ cashformat.format(getcheckingBalance()));
            getAccountType();
            break;
            case 2: getCheckingwithdrawInput();
            getAccountType();
            break;
            case 3: getCheckingDepositInput();
            getAccountType();
            break;
            case 4: 
            System.out.println("Thank you for visiting this ATM, bye");
            break;
            default: 
            System.out.println("\n"+ "Invalid choice"+"\n");
            getChecking();
            
        }

    }
    public void getSaving(){
    
        System.out.println("Saving Account");
        System.out.println("1)  View Balance");
        System.out.println("2)  Withdraw Funds");
        System.out.println("3)  Deposit funds");
        System.out.println("4)  Exit");
        System.out.print("Choice:  ");
        int select =sc.nextInt();
        switch(select){
            case 1: System.out.println("Saaving Account Balance:" + cashformat.format(getSavingbalance()));
            getAccountType();
            break;
            case 2: getsavingwithdrawInput();
            break;
            case 3:
               getSavingDepositInput();
               getAccountType();
               break;
            case 4:
            System.out.println("Thank you for using this atm,bye.");
            break;
            default: System.out.println("\n"+ "Invalid choice"+"\n");
            getSaving();
        }
        
    

    }

}
