package AdvanceOOPs;

public class staticKeyword {
    static class BankAccount {
        static int counter = 0; //counter is same for every instance. [class variable], [constant over objects], [can be accessed without creating objects]
        private String name;
        private double balance;
        BankAccount(String name, double balance) {
            this.name = name;
            this.balance = balance;
            counter++;
        }
        public int getCounter() {
            return counter;
        }
        public String getName() {
            return name;
        }
        public double getBalance() {
            return balance;
        }
    }
    public static void main(String[] args) {
        BankAccount obj1 = new BankAccount("Lando", 1000);
        System.out.println(obj1.getName());
        System.out.println(obj1.getBalance());
        System.out.println(obj1.getCounter());

        BankAccount obj2 = new BankAccount("Lewis", 2000);
        System.out.println(obj2.getName());
        System.out.println(obj2.getBalance());
        System.out.println(obj2.getCounter());

        System.out.println(BankAccount.counter);
    }
}
