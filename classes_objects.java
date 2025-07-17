public class classes_objects {
    static class Employee {
        String name; //attributes/instance variables
        int salary;
        public void setName(String n) {
            name = n;
        }
        public void setSalary(int newSalary) {
            salary = newSalary;
        }
        public int getSalary() {
            return salary;
        }
    }
    public static void main(String[] args) {
        Employee obj1 = new Employee();
        obj1.setName("Lando");
        obj1.setSalary(1000);
        System.out.println(obj1.getSalary());

        Employee obj2 = new Employee();
        obj2.setName("Lewis");
        obj2.setSalary(2000);
        System.out.println(obj2.getSalary());
    }
}
