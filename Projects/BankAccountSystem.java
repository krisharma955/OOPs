import java.util.*;

public class BankAccountSystem {
    public static class BankAccount extends Account{
        protected static int accountNumber = 100;
        public String accountHolderName;
        protected double balance;
        public static int count = 0;

        public BankAccount(String accountHolderName, double balance) {
            // System.out.println("Enter Account Holder's Name: ");
            this.accountHolderName = accountHolderName;
            // System.out.println("Enter Amount to be deposied: ");
            this.balance = balance;
            accountNumber++;
            System.out.println("Account Successfully Created.");
            System.out.println(balance+ " added successfully.");
            count++;
        }

        public BankAccount(String accountHolderName) {
            this.accountHolderName = accountHolderName;
            balance = 500;
        }

        public void deposit(double amount) {
            // System.out.println("Enter the amount to be deposited: ");
            if(amount >= 0) {
                balance += amount;
                System.out.println(amount+ " successfully deposited.");
                checkBalance();
            }
            else {
                System.out.println("Amount to be deposited in less than Zero.");
            }
        }

        public void withdraw(double amount) {
            // System.out.println("Enter the money to be withdrawn: ");
            if(balance >= amount) {
                balance -= amount;
                System.out.println(amount+ " successfully withdrawn.");
                checkBalance();
            }
            else {
                System.out.println("Insufficient Balance.");
            }
        }

        public void checkBalance() {
            System.out.println("Balance: " +balance);
        }

        public void showAccountDetails() {
            System.out.println("Account Holder Name: " +accountHolderName);
            System.out.println("Account Number: " +accountNumber);
            checkBalance();
        }

        public int numberOfAccounts() {
            return count;
        }
    }

    public static class SavingsAccount extends BankAccount {
        public SavingsAccount(String accountHolderName, double balance) {
            super(accountHolderName);
            if(balance >= 1000) {
                this.balance = balance;
                System.out.println("Account Opened Successfully.");
                afterCharges();
                showAccountDetails();
                accountNumber++;
                count++;
            }
            else {
                System.out.println("Minimum to open a Savings Account is 1000.");
            }
        }

        public void afterCharges() {
            balance -= (balance*0.02);
            System.out.println("Charge Deducted: " +(balance*0.02));
            checkBalance();
        }

        @Override
        public void withdraw(double amount) {
            if((balance - amount) > 500) {
                super.withdraw(amount);
            }
            else {
                System.out.println("Please Maintain atleast 500 in your account.");
            }
        }

        //Method overloaded - Cheque deposit
        public void deposit(String amount) {
            double amt = Double.parseDouble(amount);
            deposit(amt);
        }
    }

    abstract static class Account {
        abstract void deposit(double amount);
        abstract void withdraw(double amount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount n1 = new BankAccount(sc.nextLine(), sc.nextDouble());

        int choice = 1;
        while(choice != 0) {
            System.out.println("Choose further operations: ");
            System.out.println("1. Show Account Details.");
            System.out.println("2. Deposit Money.");
            System.out.println("3. Withdraw Money.");
            System.out.println("4. Check Balance.");
            System.out.println("5. To exit enter 5.");

            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    n1.showAccountDetails();
                    break;
                case 2:
                    System.out.println("Enter the money to be deposited: ");
                    n1.deposit(sc.nextDouble());
                    break;
                case 3:
                    System.out.println("Enter the money to be withdrawn: ");
                    n1.withdraw(sc.nextDouble());
                    break;
                case 4:
                    n1.checkBalance();
                    break;
                case 5:
                    choice = 0;
                    break;
                default:
                    System.out.println("Choose a valid option.");
                    break;
            }
        }

        sc.close();
    }
}
