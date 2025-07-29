import java.util.*;

public class BankAccountSystem {
    public static class BankAccount extends Account implements AccountOperations{
        private int accountNumber;
        private static int accountNumberGenerator = 100;
        public String accountHolderName;
        protected double balance;
        public static int count = 0;

        public BankAccount(String accountHolderName, double balance) {
            this.accountHolderName = accountHolderName;
            this.balance = balance;
            this.accountNumber = ++accountNumberGenerator;
            System.out.println("Account Successfully Created.");
            System.out.println("Your Account Number: " +accountNumber);
            System.out.println(balance+ " added successfully.");
            count++;
        }

        // public BankAccount(String accountHolderName) {
        //     this.accountHolderName = accountHolderName;
        //     balance = 500;
        // }

        public void deposit(double amount) {
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

        public static int numberOfAccounts() { //static because count is static
            return count;
        }

    }

    public static class SavingsAccount extends BankAccount {
        public SavingsAccount(String accountHolderName, double balance) {
            super(accountHolderName, balance);
            if(balance >= 1000) {
                this.balance = balance;
                System.out.println("Account Opened Successfully.");
                afterCharges();
                showAccountDetails();
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

    interface AccountOperations {
        public void deposit(double amount);
        public void withdraw(double amount);
        public void checkBalance();
        public void showAccountDetails();
    }

    public static BankAccount findAccount(ArrayList<BankAccount> accounts, int accNumber) {
        for(int i = 0; i<accounts.size(); i++) {
            if(accounts.get(i).accountNumber == accNumber) {
                return accounts.get(i);
            }
        }
        return null;
    }

    public static void Menu() {
        System.out.println("Choose further operations: ");
        System.out.println("1. Create New Account.");
        System.out.println("2. Show Account Details.");
        System.out.println("3. Deposit Money.");
        System.out.println("4. Withdraw Money.");
        System.out.println("5. Check Balance.");
        System.out.println("6. To exit.");
    }

    public static void start() {
        Scanner sc = new Scanner(System.in);
        ArrayList<BankAccount> accounts = new ArrayList<>();

        int choice = 1;
        int accNum;
        BankAccount acc;
        while(choice != 0) {
            Menu();
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter the Account Holder's Name: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.println("Enter Initial Deposit: ");
                    double balance = sc.nextDouble();
                    BankAccount newAccount = new BankAccount(name, balance);
                    accounts.add(newAccount);
                    break;
                case 2:
                    System.out.println("Enter Account Number: ");
                    accNum = sc.nextInt();
                    acc = findAccount(accounts, accNum);
                    if(acc != null) {
                        System.out.println("Enter the amount to be deposited: ");
                        acc.deposit(sc.nextDouble());
                    }
                    else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 3:
                    System.out.println("Enter Account Number: ");
                    accNum = sc.nextInt();
                    acc = findAccount(accounts, accNum);
                    if(acc != null) {
                        System.out.println("Enter Money to be Deposited: ");
                        acc.deposit(sc.nextDouble());
                    }
                    else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 4:
                    System.out.println("Enter Account Number: ");
                    accNum = sc.nextInt();
                    acc = findAccount(accounts, accNum);
                    if(acc != null) {
                        System.out.println("Enter Money to be Withdrawn: ");
                        acc.withdraw(sc.nextDouble());
                    }
                    else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 5:
                    System.out.println("Enter Account Number: ");
                    accNum = sc.nextInt();
                    acc = findAccount(accounts, accNum);
                    if(acc != null) {
                        System.out.println("Enter Money to be Withdrawn: ");
                        acc.checkBalance();
                    }
                    else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 6:
                    choice = 0;
                    break;
                default:
                    System.out.println("Choose a valid option.");
                    break;
            }
        }
        sc.close();
    }

    public static void main(String[] args) {
        start();
    }
}
