package Task3_ATMInterface;
import java.util.Scanner;
class BankAccount{
    private double balance;

    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }

    public void deposit(double amount){
        if(amount>0){
            balance += amount;
            System.out.println("Successfully deposited rupees" + amount);
        }
        else{
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount){
        if(amount>balance){
            System.out.println("Insufficient balance. Transaction failed.");
        }
        else if(amount<=0){
            System.out.println("Withdrawal amount must be ositive.");
        }
        else{
            balance-=amount;
            System.out.println("Successfully withdrawn rupees" + amount);
        }
    }
        public double getBalance(){
            return balance;
        }
    }


public class ATMInterface {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        BankAccount account=new BankAccount(10000.0);

        System.out.println("WELCOME TO THE ATM");

        boolean exit= false;
        while(!exit){
            System.out.println("\nChoose an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("Enter choice(1-4): ");

            int choice;
            if(sc.hasNextInt()){
                choice =sc.nextInt();
            }
            else{
                System.out.println("Invalid input. Please enter a number.");
                sc.next();
                continue;
            }
            switch(choice){
                case 1:
                System.out.println("Your current balance: rupees" + account.getBalance());
                break;
                case 2:
                System.out.print("Enter amount to deposit: ");
                double depositAmount =sc.nextDouble();
                account.deposit(depositAmount);
                break;
                case 3:
                System.out.print("Enter amount to withdraw: ");
                double withdrawAmount =sc.nextDouble();
                account.withdraw(withdrawAmount);
                break;
                case 4:
                exit=true;
                System.out.println("Thankyou for using the ATM. Goodbye!");
                break;
                default:
                System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
