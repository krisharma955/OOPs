package CoreOOPs;

public class inheritance {
    
    //Parent class or super class -> bcz other classes are extending to it
    static class School {
        private String name;
        School() {
            name = "JNV";
        }
        void printSchoolName() {
            System.out.println("School Name : " +name);
        }
        void demo() { //methods can be overrided if want in the child class if we're not satisfied with its logic
            System.out.println("demo by school");
        }
    }

    //subclass or child class -> a class who is extending the behaviour of another class
    //middle class or intermediatry class (for multilevel)
    static class Student extends School{
        private String name;
        Student(String name) {
            this.name = name;
        }
        void printStudentName() {
            System.out.println("Student Name : " +name);
        }
        @Override //annotation for overriding
        void demo() { //overriding the demo method in the child class
            super.demo(); //? calls the demo from the parent class
            System.out.println("demo by student");
        }
    }

    //child class (multilevel)
    // static class Parent extends Student {
    //     private String name;
    //     Parent(String name, String studentName) {
    //         super(studentName); //super keyword is used to access the student class
    //         this.name = name;
    //     }
    //     void printParentName() {
    //         System.out.println("Parent Name : " +name);
    //     }
    // }

    //! Heirarchical Inheritance
    static class Teacher extends School {
        private String name;
        private String subject;
        Teacher(String name, String subject) {
            this.name = name;
            this.subject = subject;
        }
        void printTeacherInfo() {
            System.out.println("Name : " +name);
            System.out.println("Subject : " +subject);
        }
    }
    public static void main(String[] args) {
        //School school = new School();
        // Student student = new Student("krish");
        // student.printSchoolName();
        // student.printStudentName();

        //? Parent parent = new Parent("R", "K");
        //? parent.printSchoolName();
        //? parent.printParentName();
        //? parent.printStudentName();

        // Student student = new Student("k");
        // Teacher teacher = new Teacher("R", "Maths");
        // teacher.printSchoolName();
        // teacher.printTeacherInfo();
        // student.printStudentName();

        //! overriding
        Student st = new Student("K");
        st.demo();
    }
}
