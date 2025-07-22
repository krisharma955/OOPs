public class attributes_methods {
    static class BankAccount {
        public String name;
        private double balance;
        BankAccount(String name, double balance) { //default constructor
            this.name = name;
            this.balance = balance;
        }
        public void setName(String name) { //setter method
            this.name = name;
        }
        public String getName() {
            return name;
        }
        public double getbalance() { //getter method
            return balance;
        }
        public void addMoney(double money) { 
            if(money > 0) balance += money; //error handling
            else System.out.println("Amount is in -ve"); //log statement
        }
        //error handling & log statements are V.Imp
        public boolean withdrawMoney(double amount) {
            if(amount <= balance) { //error handling
                balance -= amount;
                return true;
            }
            else {
                System.out.println("Not enough balance");
                return false;
            }
        }
        public void getDetails() {
            System.out.println("Name: " +getName());
            System.out.printf("Balance: %.2f\n", getbalance());
        }
    }
    public static void main(String[] args) {
        BankAccount e1 = new BankAccount("Lando", 135000); //bcz of default constructor
        //e1.setName("Carlos");
        //System.out.println(e1.getName());
        //System.out.println(e1.getbalance());
        e1.getDetails();
        e1.addMoney(5000);
        System.out.println("Balance: "+e1.balance);
        System.out.println(e1.withdrawMoney(5000));
        e1.getDetails();
    }
}
