package RelationshipsAndObjectBehaviour;
import java.util.*;

public class oneTmanyAss {
    public static class Student {
        private String name;
        private int id;
        Student(String name, int id) {
            this.name = name;
            this.id = id;
        }
        public String getName() {
            return name;
        }
        public int getId() {
            return id;
        }
    }
    public static class College {
        private String name;
        private ArrayList<Student> students;
        College(String name) {
            this.name = name;
            students = new ArrayList<>();
        }
        public void addStudent(Student student) {
            students.add(student);
        }
        public void printAllStudents() {
            for(int i = 0; i<students.size(); i++) {
                Student stu = students.get(i);
                System.out.println("Name: " +stu.getName()+ ", ID: " +stu.getId());
            }
        }
    }
    public static void main(String[] args) {
        Student student1 = new Student("Charles", 16);
        Student student2 = new Student("Carlos", 55);

        College college = new College("F1");
        college.addStudent(student1);
        college.addStudent(student2);
        college.printAllStudents();
    }
}
