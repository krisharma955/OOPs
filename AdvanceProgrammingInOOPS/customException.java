package AdvanceProgrammingInOOPS;

public class customException {
    public static class InsufficientBalance extends Exception {
        InsufficientBalance(String message) {
            super(message);
            System.out.println("custom exception executed");
        }
    }
    public static class BankBalance {
        String name;
        double balance;
        BankBalance(String name, double balance) {
            this.name = name;
            this.balance = balance;
        }
        public void addBalance(double amt) {
            balance += amt;
        }
        public void withdrawBalance(double amt) throws InsufficientBalance{
            if(amt > balance) {
                throw new InsufficientBalance("not enough balance");
            }
            else {
                balance -= amt;
                System.out.println("Withdraw Success");
            }
        }
    }
    public static void main(String[] args) throws InsufficientBalance{
      BankBalance obj = new BankBalance("lewis", 2000);
      obj.addBalance(100);
      try {
        obj.withdrawBalance(2000);
        obj.withdrawBalance(2000);
      } catch(InsufficientBalance e) {
        System.out.println(e.getMessage());
      }
    }  
}   
