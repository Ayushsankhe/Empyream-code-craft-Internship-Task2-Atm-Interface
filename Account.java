import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    private int customernumber;
    private int pinNumber;
    private double checkingbalance;
    private double savingbalance;

    Scanner input=new Scanner(System.in);
    DecimalFormat moneyformat=new DecimalFormat("'$'###,##0.00");
    public int setCustomerNumber(int customernumber)
    {
        this.customernumber=customernumber;
        return customernumber;
    }
    public int getCustomerNumber()
    {
        return customernumber;
    }
    public int SetPinNumber(int pinNumber)    {
        this.pinNumber=pinNumber;
        return pinNumber;
    }
    public int getPinNumber()
    {
        return pinNumber;
    }
    public double getcheckingBalance()
    {
        return checkingbalance;
    }
    public double getSavingbalance()
    {
        return savingbalance;
    }
    public double calcCheckingwithdraw(double amount)
    {
        checkingbalance=(checkingbalance-amount);
        return checkingbalance;
    }
    public double calcSavingWithdraw(double amount)
    {
        savingbalance=(savingbalance+amount);
        return savingbalance;
    }
    public double calcCheckingDeposit(double amount)
    {
        checkingbalance=(checkingbalance+amount);
        return checkingbalance;
    }
    public double calcSavingDeposit(double amount)
    {
        savingbalance=(savingbalance+amount);
        return savingbalance;
    }
    public void getCheckingwithdrawInput()
    {
        System.out.println("Checking Account Balance:"+moneyformat.format((checkingbalance)));
        System.out.println("Amount you want to withdraw from checking Account:");
        double amount=input.nextDouble();
        if((checkingbalance-amount)>=0)
        {
            calcCheckingwithdraw(amount);
            System.out.println("New checking Account balacne:"+moneyformat.format(checkingbalance));
        }
        else{
            System.out.println("Balance cannot be negative"+"\n");
        }
    }
    public void  getCheckingDepositInput()
    {
        System.out.println("Checking Account Balance:"+moneyformat.format((checkingbalance)));
        System.out.println("Amount you want to deposit from checking Account:");
        double amount=input.nextDouble();
        if((checkingbalance+amount)>=0){
            calcCheckingwithdraw(amount);
            System.out.println("New Checking Account "+moneyformat.format(checkingbalance));

        }
        else{
            System.out.println("Balance cannot be negative."+"\n");
        }
    }
    public void getsavingwithdrawInput(){
         System.out.println("Saving Account Balance:"+moneyformat.format((savingbalance)));
        System.out.println("Amount you want to deposit from saving Account:");
        double amount=input.nextDouble();
        if((savingbalance-amount)>=0){
            calcSavingWithdraw(amount);
            System.out.println("New Checking Account "+moneyformat.format(savingbalance));

        }
        else{
            System.out.println("Balance cannot be negative."+"\n");
        }

    }
    public void getSavingDepositInput()
    {
         System.out.println("Saving Account Balance:"+moneyformat.format((savingbalance)));
        System.out.println("Amount you want to deposit from saving Account:");
        double amount=input.nextDouble();
        if((savingbalance+amount)>=0){
            calcSavingDeposit(amount);
            System.out.println("New Checking Account "+moneyformat.format(savingbalance));

        }
        else{
            System.out.println("Balance cannot be negative."+"\n");
        }

    }

    
    
}


