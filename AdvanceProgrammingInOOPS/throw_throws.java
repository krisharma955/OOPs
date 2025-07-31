package AdvanceProgrammingInOOPS;

public class throw_throws {
    public static void checkAge(int age) throws Exception{
        if(age < 18) {
            throw new Exception("Not eligible to vote");
        }
        else {
            System.out.println("eligible to vote");
        }
        //int x = (age)/0;
    }
    public static void main(String[] args) {
        try {
            checkAge(17);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
