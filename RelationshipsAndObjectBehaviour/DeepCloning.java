package RelationshipsAndObjectBehaviour;

public class DeepCloning {
    static class Passport implements Cloneable{
        String passportNumber;
        Passport(String passportNumber) {
            this.passportNumber = passportNumber;
        }

        //Deep Cloning -> we've to individually clone the object
        @Override
        protected Object clone() throws CloneNotSupportedException{
            return super.clone();
        }
    }
    static class Student implements Cloneable{
        String name;
        Passport passport;

        Student(String name, Passport passport) {
            this.name = name;
            this.passport = passport;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException{
            //deep cloning
            Student clonedstudent = (Student) super.clone(); //shallow copy
            clonedstudent.passport = (Passport) passport.clone(); //individually clone the object
            return clonedstudent;
        }
    }
    public static void main(String[] args) throws CloneNotSupportedException{
        Passport passport = new Passport("987654321");
        Student student = new Student("K", passport);

        Student clonedStudent = (Student) student.clone();

        // System.out.println(student.name);
        // System.out.println(student.passport.passportNumber);
        // System.out.println(clonedStudent.name);
        // System.out.println(clonedStudent.passport.passportNumber);

        //modify
        clonedStudent.name = "R";
        System.out.println(student.name);
        System.out.println(student.passport.passportNumber);
        System.out.println(clonedStudent.name);
        System.out.println(clonedStudent.passport.passportNumber);

        clonedStudent.passport.passportNumber = "123456789";
        System.out.println(student.name);
        System.out.println(student.passport.passportNumber);
        System.out.println(clonedStudent.name);
        System.out.println(clonedStudent.passport.passportNumber);
    }
}
