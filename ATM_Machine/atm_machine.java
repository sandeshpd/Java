package Java.ATM_Machine;
import java.lang.String;
import java.util.Scanner;

public class atm_machine
{
    public static void UserDetails(int id, String name, String bank, String city)
    {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Bank Name: " + bank);
        System.out.println("City: " + city + "\n");
    }

    /*public static int BankBalance()
    {
        // add viewing bank balance feature
    }*/
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int UserId;
        String UserName;
        String BankName;
        String City;
        int outerChoice;
        char KeepGoingOn;
        int bankbalance = 500000;

        System.out.println("Enter User ID: ");
        UserId = input.nextInt();
        System.out.println("Enter the User Name: ");
        UserName = input.nextLine();
        System.out.println("Enter bank name: ");
        BankName = input.nextLine();
        System.out.println("Enter city: ");
        City = input.nextLine();
        System.out.println("\nHello, " + UserName + "! Welcome to the ATM in " + City + " city");
        
        do
        {
            System.out.println("What do you want to do today?");
            System.out.println("1. Add User Details\n2.View User Details\n3.View Bank Balance\n4. Cash Withdrawal \n5. Cash Deposit\n6. Cancel");
            System.out.println("Enter your desired choice: ");
            outerChoice = input.nextInt();
            switch (outerChoice)
            {
                case 1:
                    System.out.println("The user details are as follows: ");
                    UserDetails(UserId, UserName, BankName, City);
                    break;
                case 2:
                    System.out.println("You have " + BankBalance(bankbalance) + " in your account");
                    // BankBalance();
                    break;
                case 3:
                    System.out.println("Please enter amount to withdraw: ");
                    int MoneyDeducted = input.nextInt();
                    CashWithdraw(MoneyDeducted);
                    break;
                case 4:
                    System.out.println("Please enter the amount to deposit: ");
                    int MoneyDeposited = input.nextInt();
                    CashDeposit(MoneyDeposited);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    Thread.sleep(2000);
                    System.out.println("You have entered invalid input.\nPlease Try Again!!");
                    break;
            }
            System.out.println("Do you want to continue?\nPress (Y/N): ");
            KeepGoingOn = input.next().charAt(0);
        } while (KeepGoingOn == 'y' || KeepGoingOn == 'Y');
    }
}