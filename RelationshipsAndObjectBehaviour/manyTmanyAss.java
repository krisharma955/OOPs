package RelationshipsAndObjectBehaviour;
import java.util.*;

public class manyTmanyAss {
    public static class Student {
        private String name;
        private ArrayList<Course> courses;
        Student(String name) {
            this.name = name;
            courses = new ArrayList<>();
        }
        public void addCourse(Course course) {
            courses.add(course);
        }
        public String getName() {
            return name;
        }
        public void displayAllCourses() {
            for(int i = 0; i<courses.size(); i++) {
                System.out.println("Name: " +courses.get(i).getName());
            }
        }
    }
    public static class Course {
        private String name;
        private ArrayList<Student> students;
        Course(String name) {
            this.name = name;
            students = new ArrayList<>();
        }
        public void addStudent(Student student) {
            students.add(student);
        }
        public String getName() {
            return name;
        }
        public void displayAllStudents() {
            for(int i = 0; i<students.size(); i++) {
                System.out.println("Name: " +students.get(i).getName());
            }
        }
    }
    public static void main(String[] args) {
        Course math = new Course("Math");
        Course cs = new Course("CS");

        Student s1 = new Student("s1");
        Student s2 = new Student("s2");
        Student s3 = new Student("s3");

        s1.addCourse(cs);
        s1.addCourse(math);
        math.addStudent(s1);
        cs.addStudent(s1);

        s2.addCourse(cs);
        cs.addStudent(s2);

        s3.addCourse(math);
        math.addStudent(s3);

        cs.displayAllStudents();
        System.out.println();
        s1.displayAllCourses();
    }
}
