public class constructors {
    static class Account1 { //non-parameterized 
        String name;
        double balance;
        Account1() {
            balance = 100; //default value
        }
        public double getbalance() {
            return balance;
        }
    }
    static class Account2 { //parameterized
        String n;
        int amt;
        //this -> is used for the current instance
        Account2(String n, int amt) {
            this.n = n;
            this.amt = amt;
        }
        Account2(String n) {
            this.n = n;
        }
        Account2(int amt) {
            this.amt = amt;
        }
        //Constructor Overloading -> same constructors accepting diff paramters
        public int getbalance() {
            return amt;
        }
        public String getName() {
            return n;
        }
    }
    static class Account3 { //copy constructor
        String name;
        int money;
        Account3(String name, int money) {
            this.name = name;
            this.money = money;
        }
        Account3(Account3 account) {
            this(account.name, account.money);
        }
        // public String getName() {
        //     return name;
        // }
        // public int getMoney() {
        //     return money;
        // }
    }
    public static void main(String[] args) {
        // Account1 a = new Account1();
        // System.out.println(a.getbalance()); //100

        // Account2 a2 = new Account2("george", 2000);
        // System.out.println(a2.getName());
        // System.out.println(a2.getbalance());

        Account3 a3 = new Account3("lando", 1000);
        Account3 a4 = new Account3(a3);
        System.out.println(a4.money);
        System.out.println(a4.name);
    }
}
