package RelationshipsAndObjectBehaviour;

// One to One Association Relationship.
public class oneToneAss {
    public static class Passport {
        private int passportNumber;
        Passport(int passportNumber) {
            this.passportNumber = passportNumber;
        }

        public int getPassportNumber() {
            return passportNumber;
        }
    }
    public static class Student {
        private String name;
        Passport passport; //
        Student(String name, Passport passport) {
            this.name = name;
            this.passport = passport;
        }

        public void displayDetails() {
            System.out.println("Student Name: " +name);
            System.out.println("Passport Number: " +passport.getPassportNumber());
        }
    }
    public static void main(String[] args) {
        Passport passport = new Passport(421844322);
        Student student = new Student("Lando", passport);
        student.displayDetails();
    }
}
